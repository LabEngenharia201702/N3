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
public class MPlacavideo {
    private String NOME;
    private String FABRICANTE;
    private int QTDMEM;
    private int BANDA;
    private String VERMEM;
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

    public int getQTDMEM() {
        return QTDMEM;
    }

    public void setQTDMEM(int QTDMEM) {
        this.QTDMEM = QTDMEM;
    }

    public int getBANDA() {
        return BANDA;
    }

    public void setBANDA(int BANDA) {
        this.BANDA = BANDA;
    }

    public String getVERMEM() {
        return VERMEM;
    }

    public void setVERMEM(String VERMEM) {
        this.VERMEM = VERMEM;
    }

    public float getPRECO() {
        return PRECO;
    }

    public void setPRECO(float PRECO) {
        this.PRECO = PRECO;
    }

    public int getID_VID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
       return NOME;
   }
}
