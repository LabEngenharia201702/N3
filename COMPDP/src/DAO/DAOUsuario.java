/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BancoFactory.BancoFactory;

import Model.MUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author almei
 */
public class DAOUsuario {
    private PreparedStatement pst; //Variável que vai conter o comando SQL
    private ResultSet rs;//Utiliza essa variável quando o comando SELECT é usado. 

    public boolean inserir(MUsuario obj,String comando) throws SQLException {
        if(comando.length()==0){
            comando="insert into USERS(CODIGO,NOME,SENHA,EMAIL,TIPO) values (?,?,?,?,?)";
        }
        try{
            BancoFactory.abrir();
            pst=BancoFactory.getConnection().prepareStatement(comando);
            pst.setString(1,obj.getCODIGO());
            pst.setString(2,obj.getNOME());
            pst.setString(3,obj.getSENHA());
            pst.setString(4,obj.getEMAIL());
            pst.setString(5,obj.getTIPO());
            int rows = pst.executeUpdate();
            return rows > 0;
        }finally{
            BancoFactory.fechar();
        }
    }
    
    public MUsuario buscar(MUsuario obj,String comando) throws SQLException {
        if(comando.length()==0){
            comando="SELECT * FROM USERS WHERE CODIGO=?";
        }
        try {
            BancoFactory.abrir();
            pst = BancoFactory.getConnection().prepareStatement(
                comando);
            pst.setString(1, obj.getCODIGO());
            
            rs = pst.executeQuery();
            if(rs.next()) {
                obj.setCODIGO(rs.getString("CODIGO"));
                obj.setSENHA(rs.getString("SENHA"));
                obj.setTIPO(rs.getString("TIPO"));
                return obj;
            } else {
                return null;
            }
            
        } finally {
            BancoFactory.fechar();
        }
    }

    
}
