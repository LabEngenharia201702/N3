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
public class MArmazenamento {
    	private String MODELO; 
	private String FABRICANTE;
	private String SLOT;
	private int CONSUMO;
	private float PRECO;
        
    public String getMODELO() {
        return MODELO;
    }

    public void setMODELO(String MODELO) {
        this.MODELO = MODELO;
    }

    public String getFABRICANTE() {
        return FABRICANTE;
    }

    public void setFABRICANTE(String FABRICANTE) {
        this.FABRICANTE = FABRICANTE;
    }

    public String getSLOT() {
        return SLOT;
    }

    public void setSLOT(String SLOT) {
        this.SLOT = SLOT;
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

    public int getID_ARM() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString(){
       return MODELO;
   }
}
