/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BancoFactory.BancoFactory;
import Model.MFonte;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
    private String NOME;
    private String FABRICANTE; 
    private int POTENCIA;
    private boolean PREAL;
    private String CERTIFICADO;
    private float PRECO;
 */
public class DAOFonte implements DAO<MFonte>{
    private PreparedStatement pst; //Variável que vai conter o comando SQL
    private ResultSet rs;//Utiliza essa variável quando o comando SELECT é usado. 

    @Override
    public boolean inserir(MFonte obj,String comando) throws SQLException {
        if(comando.length()==0){
            comando="insert into FONTE(NOME,FABRICANTE,POTENCIA,PREAL,CERTIFICADO,PRECO) values (?,?,?,?,?,?)";
        }

        try{
            BancoFactory.abrir();
            pst=BancoFactory.getConnection().prepareStatement(comando);
            pst.setString(1,obj.getNOME());
            pst.setString(2,obj.getFABRICANTE());
            pst.setInt(3,obj.getPOTENCIA());
            pst.setBoolean(4,obj.isPREAL());
            pst.setString(5,obj.getCERTIFICADO());
            pst.setFloat(6,obj.getPRECO());
            
            int rows = pst.executeUpdate();
            return rows > 0;
        }finally{
            BancoFactory.fechar();
        }
    }


    @Override
    public MFonte buscar(MFonte obj,String comando) throws SQLException {
        if(comando.length()==0){
            comando="SELECT * FROM FONTE WHERE ID_FON=?";
        }
        try {
            BancoFactory.abrir();
            pst = BancoFactory.getConnection().prepareStatement(
                comando);
            pst.setInt(1, obj.getID_FON());
            
            rs = pst.executeQuery();
            if(rs.next()) {

                obj.setNOME(rs.getString("NOME"));
                obj.setFABRICANTE(rs.getString("FABRICANTE"));
                obj.setPOTENCIA(rs.getInt("POTENCIA"));
                obj.setPREAL(rs.getBoolean("PREAL"));
                obj.setCERTIFICADO(rs.getString("CERTIFICADO"));
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
    public  List<MFonte> listar(String criterio) throws SQLException {
        String sql;
        
        if(criterio.length() == 0){
            sql="select * from FONTE";
        }else{
            sql=criterio;
        }
        
        
        try{
            List<MFonte> FON = new ArrayList<>();
            BancoFactory.abrir();
            pst=BancoFactory.getConnection().prepareStatement(sql);
            rs=pst.executeQuery();
            
                while(rs.next()){
                    MFonte fonte=new MFonte();
                        fonte.setNOME(rs.getString("NOME"));
                        fonte.setFABRICANTE(rs.getString("FABRICANTE"));
                        fonte.setPOTENCIA(rs.getInt("POTENCIA"));
                        fonte.setPREAL(rs.getBoolean("PREAL"));
                        fonte.setCERTIFICADO(rs.getString("CERTIFICADO"));
                        fonte.setPRECO(rs.getFloat("PRECO"));

                    FON.add(fonte);
                }
                return FON;
 
        }finally{
            BancoFactory.fechar();
        }
    }

    @Override
    public boolean alterar(MFonte obj, String comando) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(MFonte obj, String comando) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
