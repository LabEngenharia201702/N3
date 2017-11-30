/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BancoFactory.BancoFactory;
import Model.MMemoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author almei
 */
public class DAOMemoria implements DAO<MMemoria>{
    private PreparedStatement pst; //Variável que vai conter o comando SQL
    private ResultSet rs;//Utiliza essa variável quando o comando SELECT é usado. 

    @Override
    public boolean inserir(MMemoria obj,String comando) throws SQLException {
        if(comando.length()==0){
            comando="insert into MEMORIA(NOME,FABRICANTE,QTDMEM,FREQ,VERMEM,PRECO) values (?,?,?,?,?,?)";
        }
   /* private String NOME; 
    private String FABRICANTE;
    private int QTDMEM ;
    private int FREQ;
    private String VERMEM;
    private float PRECO;*/
        try{
            BancoFactory.abrir();
            pst=BancoFactory.getConnection().prepareStatement(comando);
            pst.setString(1,obj.getNOME());
            pst.setString(2,obj.getFABRICANTE());
            pst.setInt(3,obj.getQTDMEM());
            pst.setInt(4,obj.getFREQ());
            pst.setString(5,obj.getVERMEM());
            pst.setFloat(6,obj.getPRECO());
            
            int rows = pst.executeUpdate();
            return rows > 0;
        }finally{
            BancoFactory.fechar();
        }
    }


    @Override
    public MMemoria buscar(MMemoria obj,String comando) throws SQLException {
        if(comando.length()==0){
            comando="SELECT * FROM MEMORIA WHERE ID_MEM=?";
        }
        try {
            BancoFactory.abrir();
            pst = BancoFactory.getConnection().prepareStatement(
                comando);
            pst.setInt(1, obj.getID_MEM());
            
            rs = pst.executeQuery();
            if(rs.next()) {

                obj.setNOME(rs.getString("NOME"));
                obj.setFABRICANTE(rs.getString("FABRICANTE"));
                obj.setQTDMEM(rs.getInt("QTDMEM"));
                obj.setFREQ(rs.getInt("FREQ"));
                obj.setVERMEM(rs.getString("VERMEM"));
                obj.setPRECO(rs.getFloat("PRECO"));

                return obj;
            } else {
                return null;
            }
            
        } finally {
            BancoFactory.fechar();
        }
    }

    @Override
    public  List<MMemoria> listar(String criterio) throws SQLException {
        String sql;
        
        if(criterio.length() == 0){
            sql="select * from MEMORIA";
        }else{
            sql=criterio;
        }
        
        
        try{
            List<MMemoria> mem = new ArrayList<>();
            BancoFactory.abrir();
            pst=BancoFactory.getConnection().prepareStatement(sql);
            rs=pst.executeQuery();
            
                while(rs.next()){
                    MMemoria memo=new MMemoria();
                        memo.setNOME(rs.getString("NOME"));
                        memo.setFABRICANTE(rs.getString("FABRICANTE"));
                        memo.setQTDMEM(rs.getInt("QTDMEM"));
                        memo.setFREQ(rs.getInt("FREQ"));
                        memo.setVERMEM(rs.getString("VERMEM"));
                        memo.setPRECO(rs.getFloat("PRECO"));

                    mem.add(memo);
                }
                return mem;
 
        }finally{
            BancoFactory.fechar();
        }
    }
    
  
    @Override
    public boolean alterar(MMemoria obj, String comando) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(MMemoria obj, String comando) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
