/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.DAOMemoria;
import Model.MMemoria;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author almei
 */
public class MemoriaRAM extends javax.swing.JFrame {

    /**
     * Creates new form MemoriaRAM
     */
    public MemoriaRAM() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_nome = new javax.swing.JTextField();
        txt_Fab = new javax.swing.JTextField();
        txt_qtdemem = new javax.swing.JTextField();
        txt_frequencia = new javax.swing.JTextField();
        txt_vermem = new javax.swing.JTextField();
        txt_preco = new javax.swing.JTextField();
        btn_Cadastrar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        txt_nome.setBackground(new java.awt.Color(0, 0, 0));
        txt_nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_nome.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_nome);
        txt_nome.setBounds(140, 210, 250, 30);

        txt_Fab.setBackground(new java.awt.Color(0, 0, 0));
        txt_Fab.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Fab.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_Fab);
        txt_Fab.setBounds(140, 250, 250, 30);

        txt_qtdemem.setBackground(new java.awt.Color(0, 0, 0));
        txt_qtdemem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_qtdemem.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_qtdemem);
        txt_qtdemem.setBounds(140, 290, 250, 30);

        txt_frequencia.setBackground(new java.awt.Color(0, 0, 0));
        txt_frequencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_frequencia.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_frequencia);
        txt_frequencia.setBounds(140, 330, 250, 30);

        txt_vermem.setBackground(new java.awt.Color(0, 0, 0));
        txt_vermem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_vermem.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_vermem);
        txt_vermem.setBounds(140, 370, 250, 30);

        txt_preco.setBackground(new java.awt.Color(0, 0, 0));
        txt_preco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_preco.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_preco);
        txt_preco.setBounds(140, 410, 250, 30);

        btn_Cadastrar.setBackground(new java.awt.Color(0, 0, 0));
        btn_Cadastrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_Cadastrar.setForeground(new java.awt.Color(153, 153, 255));
        btn_Cadastrar.setText("Cadastrar");
        btn_Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CadastrarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Cadastrar);
        btn_Cadastrar.setBounds(410, 390, 120, 50);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nome");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 210, 70, 30);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fabricante");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(30, 250, 140, 30);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Mem(Qtde.)");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(30, 290, 120, 30);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Frequência");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(30, 330, 110, 30);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("VERMEM");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(30, 370, 100, 30);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Preço R$");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(30, 410, 100, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/arrow-back-icon.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(660, 390, 50, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/COMPING9.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 828, 570);

        setSize(new java.awt.Dimension(828, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       PainelLevelTec tec = new PainelLevelTec();
       tec.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btn_CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CadastrarMouseClicked
        MMemoria mem=new MMemoria();
        DAOMemoria daomem=new DAOMemoria();       

        
        boolean check=true;
        
        
            if(txt_nome.getText().isEmpty()    || txt_Fab.getText().isEmpty() 
            || txt_qtdemem.getText().isEmpty() || txt_frequencia.getText().isEmpty()
            || txt_preco.getText().isEmpty() || txt_vermem.getText().isEmpty() 
            ){
                JOptionPane.showMessageDialog(null,"Por favor, preencha todos os campos corretamente");
                check=false;
            }


            if(check=true){
                mem.setNOME(txt_nome.getText());
                mem.setFABRICANTE(txt_Fab.getText());
                mem.setQTDMEM(Integer.parseInt(txt_qtdemem.getText()));
                mem.setFREQ(Integer.parseInt(txt_frequencia.getText()));
                mem.setVERMEM(txt_vermem.getText());
                mem.setPRECO(Float.parseFloat(txt_preco.getText()));
                if(btn_Cadastrar.getText().equals("Cadastrar")){ 
                    try {
                        daomem.inserir(mem,"");
                        JOptionPane.showMessageDialog(null,"Memória RAM cadastrada com sucesso!");
                    } catch (SQLException ex) {
                        Logger.getLogger(PlacaMae.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                   esvaziarCampos();
            }
    }     
    }//GEN-LAST:event_btn_CadastrarMouseClicked
    private void esvaziarCampos(){
        txt_frequencia.setText("");
        txt_nome.setText("");
        txt_qtdemem.setText("");
        txt_preco.setText("");
        txt_Fab.setText("");
        txt_vermem.setText("");

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MemoriaRAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemoriaRAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemoriaRAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemoriaRAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemoriaRAM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_Fab;
    private javax.swing.JTextField txt_frequencia;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_preco;
    private javax.swing.JTextField txt_qtdemem;
    private javax.swing.JTextField txt_vermem;
    // End of variables declaration//GEN-END:variables
}