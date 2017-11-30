/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author almeida
 */
public class MPlacaMae {
        private int ID_PM;
        private String NOME;
        private String FABRICANTE;
        private String SOCKET;
        private String TIPOSATA;
        private int QTDSATA;
        private String VERMEM;
        private int FMEM;
        private int MEMAX;
        private int QTDPCI;
        private boolean M2;
        private boolean IDE;
        private float PRECO;
        
        
    public int getFMEM() {
        return FMEM;
    }

    public void setFMEM(int FMEM) {
        this.FMEM = FMEM;
    }
    public int getID_PM() {
        return ID_PM;
    }

    public void setID_PM(int ID_PM) {
        this.ID_PM = ID_PM;
    }

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

    public String getTIPOSATA() {
        return TIPOSATA;
    }

    public void setTIPOSATA(String TIPOSATA) {
        this.TIPOSATA = TIPOSATA;
    }

    public int getQTDSATA() {
        return QTDSATA;
    }

    public void setQTDSATA(int QTDSATA) {
        this.QTDSATA = QTDSATA;
    }

    public String getVERMEM() {
        return VERMEM;
    }

    public void setVERMEM(String VERMEM) {
        this.VERMEM = VERMEM;
    }

    public int getMEMAX() {
        return MEMAX;
    }

    public void setMEMAX(int MEMAX) {
        this.MEMAX = MEMAX;
    }

    public int getQTDPCI() {
        return QTDPCI;
    }

    public void setQTDPCI(int QTDPCI) {
        this.QTDPCI = QTDPCI;
    }

    public boolean isM2() {
        return M2;
    }

    public void setM2(boolean M2) {
        this.M2 = M2;
    }

    public boolean isIDE() {
        return IDE;
    }

    public void setIDE(boolean IDE) {
        this.IDE = IDE;
    }

    public float getPRECO() {
        return PRECO;
    }

    public void setPRECO(float PRECO) {
        this.PRECO = PRECO;
    }

    public String getNOME(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getFABRICANTE(String fabricante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSOCKET(String socket) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTIPOSATA(String tiposata) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getQTDSATA(String qtdsata) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getQTDPCI(String qtdpci) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getVERMEM(String vermem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getFMEM(String fmem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMEMAX(String memax) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public float getPRECO(String preco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean isM2(String m2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean isIDE(String ide) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setFREQUENCIA(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCACHE(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCONSUMO(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
  @Override
   public String toString(){
       return NOME;
   }

}
