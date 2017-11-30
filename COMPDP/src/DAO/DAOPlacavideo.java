/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import BancoFactory.BancoFactory;
import Model.MPlacavideo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
    private String NOME;
    private String FABRICANTE;
    private int QTDMEM;
    private int BANDA;
    private String VERMEM;
    private float PRECO;
 */
public class DAOPlacavideo implements DAO<MPlacavideo>{
    private PreparedStatement pst; //Variável que vai conter o comando SQL
    private ResultSet rs;//Utiliza essa variável quando o comando SELECT é usado. 

    @Override
    public boolean inserir(MPlacavideo obj,String comando) throws SQLException {
        if(comando.length()==0){
            comando="insert into VIDEO(NOME,FABRICANTE,QTDMEM,BANDA,VERMEM,PRECO) values (?,?,?,?,?,?)";
        }
        try{
            BancoFactory.abrir();
            pst=BancoFactory.getConnection().prepareStatement(comando);
            pst.setString(1,obj.getNOME());
            pst.setString(2,obj.getFABRICANTE());
            pst.setInt(3,obj.getQTDMEM());
            pst.setInt(4,obj.getBANDA());
            pst.setString(5,obj.getVERMEM());
            pst.setFloat(6,obj.getPRECO());
            
            int rows = pst.executeUpdate();
            return rows > 0;
        }finally{
            BancoFactory.fechar();
        }
    }


    @Override
    public MPlacavideo buscar(MPlacavideo obj,String comando) throws SQLException {
        if(comando.length()==0){
            comando="SELECT * FROM VIDEO WHERE ID_VID=?";
        }
        try {
            BancoFactory.abrir();
            pst = BancoFactory.getConnection().prepareStatement(
                comando);
            pst.setInt(1, obj.getID_VID());
            
            rs = pst.executeQuery();
            if(rs.next()) {

                obj.setNOME(rs.getString("NOME"));
                obj.setFABRICANTE(rs.getString("FABRICANTE"));
                obj.setQTDMEM(rs.getInt("QTDMEM"));
                obj.setBANDA(rs.getInt("BANDA"));
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
    public  List<MPlacavideo> listar(String criterio) throws SQLException {
        String sql;
        
        if(criterio.length() == 0){
            sql="select * from VIDEO";
        }else{
            sql=criterio;
        }
        
        
        try{
            List<MPlacavideo> VID = new ArrayList<>();
            BancoFactory.abrir();
            pst=BancoFactory.getConnection().prepareStatement(sql);
            rs=pst.executeQuery();
            
                while(rs.next()){
                    MPlacavideo video=new MPlacavideo();
                        video.setNOME(rs.getString("NOME"));
                        video.setFABRICANTE(rs.getString("FABRICANTE"));
                        video.setQTDMEM(rs.getInt("QTDMEM"));
                        video.setBANDA(rs.getInt("BANDA"));
                        video.setVERMEM(rs.getString("VERMEM"));
                        video.setPRECO(rs.getFloat("PRECO"));

                    VID.add(video);
                }
                return VID;
 
        }finally{
            BancoFactory.fechar();
        }
    }

    @Override
    public boolean alterar(MPlacavideo obj, String comando) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(MPlacavideo obj, String comando) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
