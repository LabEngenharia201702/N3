/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author almei
 */
public class MProcessador {
	private String NOME;
	private String FABRICANTE ;
	private String SOCKET ;
	private int FREQUENCIA ;
	private int CACHE ;
	private int CONSUMO;
	private float PRECO; 
        
    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getFABRICANTE() {
        return FABRICANTE;
    }

    public void setFABRICANTE(String FABRICANTE) {
        this.FABRICANTE = FABRICANTE;
    }

    public String getSOCKET() {
        return SOCKET;
    }

    public void setSOCKET(String SOCKET) {
        this.SOCKET = SOCKET;
    }

    public int getFREQUENCIA() {
        return FREQUENCIA;
    }

    public void setFREQUENCIA(int FREQUENCIA) {
        this.FREQUENCIA = FREQUENCIA;
    }

    public int getCACHE() {
        return CACHE;
    }

    public void setCACHE(int CACHE) {
        this.CACHE = CACHE;
    }

    public int getCONSUMO() {
        return CONSUMO;
    }

    public void setCONSUMO(int CONSUMO) {
        this.CONSUMO = CONSUMO;
    }

    public float getPRECO() {
        return PRECO;
    }

    public void setPRECO(float PRECO) {
        this.PRECO = PRECO;
    }

    public int getID_PRO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
       return NOME;
   }



}
