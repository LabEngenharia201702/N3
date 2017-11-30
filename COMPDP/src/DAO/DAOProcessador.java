/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BancoFactory.BancoFactory;
import Model.MProcessador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author almei
 */
public class DAOProcessador implements DAO<MProcessador>{
    private PreparedStatement pst; //Variável que vai conter o comando SQL
    private ResultSet rs;//Utiliza essa variável quando o comando SELECT é usado. 

   // @Override
    @Override
    public boolean inserir(MProcessador obj,String comando) throws SQLException {
        if(comando.length()==0){
            comando="insert into PROCESSADOR(NOME,FABRICANTE,SOCKET,FREQUENCIA,CACHE,CONSUMO,PRECO) values (?,?,?,?,?,?,?)";
        }
        try{
            BancoFactory.abrir();
            pst=BancoFactory.getConnection().prepareStatement(comando);
            pst.setString(1,obj.getNOME());
            pst.setString(2,obj.getFABRICANTE());
            pst.setString(3,obj.getSOCKET());
            pst.setInt(4,obj.getFREQUENCIA());
            pst.setInt(5,obj.getCACHE());
            pst.setInt(6,obj.getCONSUMO());
            pst.setFloat(7,obj.getPRECO());
            
            int rows = pst.executeUpdate();
            return rows > 0;
        }finally{
            BancoFactory.fechar();
        }
    }

    /**
     *
     * @param obj
     * @param comando
     * @return
     * @throws SQLException
     */
    @Override
    public MProcessador buscar(MProcessador obj,String comando) throws SQLException {
        if(comando.length()==0){
            comando="SELECT * FROM PROCESSADOR WHERE ID_PRO=?";
        }
        try {
            BancoFactory.abrir();
            pst = BancoFactory.getConnection().prepareStatement(
                comando);
            pst.setInt(1, obj.getID_PRO());
            
            rs = pst.executeQuery();
            if(rs.next()) {

                obj.setNOME(rs.getString("NOME"));
                obj.setFABRICANTE(rs.getString("FABRICANTE"));
                obj.setSOCKET(rs.getString("SOCKET"));
                obj.setFREQUENCIA(rs.getInt("FREQUENCIA"));
                obj.setCACHE(rs.getInt("CACHE"));
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

    /**
     *
     * @param criterio
     * @return
     * @throws SQLException
     */
    @Override
    public  List<MProcessador> listar(String criterio) throws SQLException {
        String sql;
        
        if(criterio.length() == 0){
            sql="select * from PROCESSADOR";
        }else{
            sql=criterio;
        }
        
        System.out.println(sql);
        
        
        try{
            List<MProcessador> processadores = new ArrayList<>();
            BancoFactory.abrir();
            pst=BancoFactory.getConnection().prepareStatement(sql);
            rs=pst.executeQuery();
            
                while(rs.next()){
                    MProcessador pro=new MProcessador();
                        pro.setNOME(rs.getString("NOME"));
                        pro.setFABRICANTE(rs.getString("FABRICANTE"));
                        pro.setSOCKET(rs.getString("SOCKET"));
                        pro.setFREQUENCIA(rs.getInt("FREQUENCIA"));
                        pro.setCACHE(rs.getInt("CACHE"));
                        pro.setCONSUMO(rs.getInt("CONSUMO"));
                        pro.setPRECO(rs.getFloat("PRECO"));

                    processadores.add(pro);
                }
                return processadores;
 
        }finally{
            BancoFactory.fechar();
        }
    }

    @Override
    public boolean alterar(MProcessador obj, String comando) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(MProcessador obj, String comando) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    
}
