package DAO;

import BancoFactory.BancoFactory;
import Model.MPlacaMae;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOPlaca implements DAO<MPlacaMae>{
    private PreparedStatement pst; //Variável que vai conter o comando SQL
    private ResultSet rs;//Utiliza essa variável quando o comando SELECT é usado. 

    @Override
    public boolean inserir(MPlacaMae obj,String comando) throws SQLException {
        if(comando.length()==0){
            comando="insert into PLACAMAE(NOME,FABRICANTE,SOCKET,TIPOSATA,QTDSATA,VERMEM,FMEM,MEMAX,QTDPCI,M2,IDE,PRECO) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        }
        try{
            BancoFactory.abrir();
            pst=BancoFactory.getConnection().prepareStatement(comando);
            pst.setString(1,obj.getNOME());
            pst.setString(2,obj.getFABRICANTE());
            pst.setString(3,obj.getSOCKET());
            pst.setString(4,obj.getTIPOSATA());
            pst.setInt(5,obj.getQTDSATA());
            pst.setString(6,obj.getVERMEM());
            pst.setInt(7,obj.getFMEM());
            pst.setInt(8,obj.getMEMAX());
            pst.setInt(9,obj.getQTDPCI());
            pst.setBoolean(10,obj.isM2()); 
            pst.setBoolean(11,obj.isIDE());
            pst.setFloat(12,obj.getPRECO());
            
            int rows = pst.executeUpdate();
            return rows > 0;
        }finally{
            BancoFactory.fechar();
        }
    }

    @Override
    public boolean alterar(MPlacaMae obj,String comando) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public boolean excluir(MPlacaMae obj,String comando) throws SQLException {
        if(comando.length()==0){
            comando="delete from PLACAMAE where ID_PM=?";
        }
        try{
            BancoFactory.abrir();
            pst=BancoFactory.getConnection().prepareStatement(comando);
            pst.setInt(1,obj.getID_PM());
            int rows = pst.executeUpdate();
            return rows > 0;
        }finally{
            BancoFactory.fechar();
        }
    }

    @Override
    public MPlacaMae buscar(MPlacaMae obj,String comando) throws SQLException {
        if(comando.length()==0){
            comando="SELECT * FROM PLACAMAE WHERE NOME=?";
        }
        try {
            BancoFactory.abrir();
            pst = BancoFactory.getConnection().prepareStatement(
                comando);
          //  pst.setInt(1, obj.getID_PM());
            pst.setString(1, obj.getNOME());
            
            rs = pst.executeQuery();
            if(rs.next()) {

                obj.setNOME(rs.getString("NOME"));
                obj.setFABRICANTE(rs.getString("FABRICANTE"));
                obj.setSOCKET(rs.getString("SOCKET"));
                obj.setTIPOSATA(rs.getString("TIPOSATA"));
                obj.setQTDSATA(rs.getInt("QTDSATA"));
                obj.setVERMEM(rs.getString("VERMEM"));
                obj.setFMEM(rs.getInt("FMEM"));
                obj.setMEMAX(rs.getInt("MEMAX"));
                obj.setQTDPCI(rs.getInt("QTDPCI"));
                obj.setM2(rs.getBoolean("M2"));
                obj.setIDE(rs.getBoolean("IDE"));
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
    public  List<MPlacaMae> listar(String criterio) throws SQLException {
        String sql;
        
        if(criterio.length() == 0){
            sql="select * from PLACAMAE";
        }else{
            sql=criterio;
        }
        
        
        try{
            List<MPlacaMae> placas = new ArrayList<>();
            BancoFactory.abrir();
            pst=BancoFactory.getConnection().prepareStatement(sql);
            rs=pst.executeQuery();
            
                while(rs.next()){
                    MPlacaMae placa=new MPlacaMae();
                        placa.setNOME(rs.getString("NOME"));
                        placa.setFABRICANTE(rs.getString("FABRICANTE"));
                        placa.setSOCKET(rs.getString("SOCKET"));
                        placa.setTIPOSATA(rs.getString("TIPOSATA"));
                        placa.setQTDSATA(rs.getInt("QTDSATA"));
                        placa.setVERMEM(rs.getString("VERMEM"));
                        placa.setFMEM(rs.getInt("FMEM"));
                        placa.setMEMAX(rs.getInt("MEMAX"));
                        placa.setQTDPCI(rs.getInt("QTDPCI"));
                        placa.setM2(rs.getBoolean("M2"));
                        placa.setIDE(rs.getBoolean("IDE"));
                        placa.setPRECO(rs.getFloat("PRECO"));

                    placas.add(placa);
                }
                return placas;
 
        }finally{
            BancoFactory.fechar();
        }
    }
    


    
}


