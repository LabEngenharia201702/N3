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
public class MFonte {
    private String NOME;
    private String FABRICANTE; 
    private int POTENCIA;
    private boolean PREAL = false;
    private String CERTIFICADO;
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

    public int getPOTENCIA() {
        return POTENCIA;
    }

    public void setPOTENCIA(int POTENCIA) {
        this.POTENCIA = POTENCIA;
    }

    public boolean isPREAL() {
        return PREAL;
    }

    public void setPREAL(boolean PREAL) {
        this.PREAL = PREAL;
    }

    public String getCERTIFICADO() {
        return CERTIFICADO;
    }

    public void setCERTIFICADO(String CERTIFICADO) {
        this.CERTIFICADO = CERTIFICADO;
    }

    public float getPRECO() {
        return PRECO;
    }

    public void setPRECO(float PRECO) {
        this.PRECO = PRECO;
    }


    public int getID_FON() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
       return NOME;
   }
    
}
