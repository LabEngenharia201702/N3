/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BancoFactory.BancoFactory;
import Model.MArmazenamento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author almei
 */
public class DAOArmazenamento implements DAO<MArmazenamento> {
    private PreparedStatement pst; //Variável que vai conter o comando SQL
    private ResultSet rs;//Utiliza essa variável quando o comando SELECT é usado. 

    @Override
    public boolean inserir(MArmazenamento obj,String comando) throws SQLException {
        if(comando.length()==0){
            comando="insert into ARMAZENAMENTO(MODELO,FABRICANTE,SLOT,CONSUMO,PRECO) values (?,?,?,?,?)";
        }
   /*   private String MODELO; 
	private String FABRICANTE;
	private String SLOT;
	private int CONSUMO;
	private float PRECO;
        */
        try{
            BancoFactory.abrir();
            pst=BancoFactory.getConnection().prepareStatement(comando);
            pst.setString(1,obj.getMODELO());
            pst.setString(2,obj.getFABRICANTE());
            pst.setString(3,obj.getSLOT());
            pst.setInt(4,obj.getCONSUMO());
            pst.setFloat(5,obj.getPRECO());
            
            int rows = pst.executeUpdate();
            return rows > 0;
        }finally{
            BancoFactory.fechar();
        }
    }



    @Override
    public MArmazenamento buscar(MArmazenamento obj,String comando) throws SQLException {
        if(comando.length()==0){
            comando="SELECT * FROM ARMAZENAMENTO WHERE ID_ARM=?";
        }
        try {
            BancoFactory.abrir();
            pst = BancoFactory.getConnection().prepareStatement(
                comando);
            pst.setInt(1, obj.getID_ARM());
            
            rs = pst.executeQuery();
            if(rs.next()) {

                obj.setMODELO(rs.getString("MODELO"));
                obj.setFABRICANTE(rs.getString("FABRICANTE"));
                obj.setSLOT(rs.getString("SLOT"));
                obj.setCONSUMO(rs.getInt("CONSUMO"));
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
    public  List<MArmazenamento> listar(String criterio) throws SQLException {
        String sql;
        
        if(criterio.length() == 0){
            sql="select * from ARMAZENAMENTO";
        }else{
            sql=criterio;
        }
        
        
        try{
            List<MArmazenamento> arm = new ArrayList<>();
            BancoFactory.abrir();
            pst=BancoFactory.getConnection().prepareStatement(sql);
            rs=pst.executeQuery();
            
                while(rs.next()){
                    MArmazenamento armazenament=new MArmazenamento();
                        armazenament.setMODELO(rs.getString("MODELO"));
                        armazenament.setFABRICANTE(rs.getString("FABRICANTE"));
                        armazenament.setSLOT(rs.getString("SLOT"));
                        armazenament.setCONSUMO(rs.getInt("CONSUMO"));
                        armazenament.setPRECO(rs.getFloat("PRECO"));

                    arm.add(armazenament);
                }
                return arm;
 
        }finally{
            BancoFactory.fechar();
        }
    }
    
  
  
    @Override
    public boolean alterar(MArmazenamento obj, String comando) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(MArmazenamento obj, String comando) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
