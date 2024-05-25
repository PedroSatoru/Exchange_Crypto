/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetobanco.View;

import javax.swing.JLabel;
import javax.swing.JPanel;
import projetobanco.Controller.ControllerSaldo;
import projetobanco.Model.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Pedro Satoru
 */
public class JanelaSaldo extends javax.swing.JFrame {
    private Usuario usuario;
   

    /**
     * Creates new form JanelaSaldo
     * @param usuario
     * @param conn
     */
    public JanelaSaldo(Usuario usuario,  Connection conn) {
        this.usuario = usuario;
        control = new ControllerSaldo(conn);
        initComponents();
        atualizarDadosUsuario();

    }

    /**
     *
     * @return
     */
    public JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     *
     * @param jLabel1
     */
    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     *
     * @return
     */
    public JLabel getjLabel2() {
        return jLabel2;
    }

    /**
     *
     * @param jLabel2
     */
    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    /**
     *
     * @return
     */
    public JLabel getjLabel3() {
        return jLabel3;
    }

    /**
     *
     * @param jLabel3
     */
    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    /**
     *
     * @return
     */
    public JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     *
     * @param jLabel4
     */
    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    /**
     *
     * @return
     */
    public JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     *
     * @param jLabel5
     */
    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    /**
     *
     * @return
     */
    public JLabel getjLabel7() {
        return jLabel7;
    }

    /**
     *
     * @param jLabel7
     */
    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    /**
     *
     * @return
     */
    public JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     *
     * @param jPanel1
     */
    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    /**
     *
     * @return
     */
    public JLabel getLbBtc() {
        return lbBtc;
    }

    /**
     *
     * @param lbBtc
     */
    public void setLbBtc(JLabel lbBtc) {
        this.lbBtc = lbBtc;
    }

    /**
     *
     * @return
     */
    public JLabel getLbCpf() {
        return lbCpf;
    }

    /**
     *
     * @param lbCpf
     */
    public void setLbCpf(JLabel lbCpf) {
        this.lbCpf = lbCpf;
    }

    /**
     *
     * @return
     */
    public JLabel getLbEth() {
        return lbEth;
    }

    /**
     *
     * @param lbEth
     */
    public void setLbEth(JLabel lbEth) {
        this.lbEth = lbEth;
    }

    /**
     *
     * @return
     */
    public JLabel getLbNome() {
        return lbNome;
    }

    /**
     *
     * @param lbNome
     */
    public void setLbNome(JLabel lbNome) {
        this.lbNome = lbNome;
    }

    /**
     *
     * @return
     */
    public JLabel getLbReais() {
        return lbReais;
    }

    /**
     *
     * @param lbReais
     */
    public void setLbReais(JLabel lbReais) {
        this.lbReais = lbReais;
    }

    /**
     *
     * @return
     */
    public JLabel getLbRip() {
        return lbRip;
    }

    /**
     *
     * @param lbRip
     */
    public void setLbRip(JLabel lbRip) {
        this.lbRip = lbRip;
    }
     private void atualizarDadosUsuario() {
        try {
            Usuario usuarioAtualizado = control.atualizarDadosUsuario(usuario.getCpf());

            lbNome.setText(usuarioAtualizado.getNome());
            lbCpf.setText(usuarioAtualizado.getCpf());
            lbReais.setText(String.format("%.2f", usuarioAtualizado.getReais()));
            lbBtc.setText(String.format("%.2f", usuarioAtualizado.getBtc()));
            lbEth.setText(String.format("%.2f", usuarioAtualizado.getEth()));
            lbRip.setText(String.format("%.2f", usuarioAtualizado.getRip()));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar dados do usuário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbBtc = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbEth = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbReais = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbRip = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Nome:");

        lbNome.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lbNome.setText("nome_usuario");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("CPF:");

        lbCpf.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lbCpf.setText("cpf_usuario");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbBtc.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lbBtc.setText("btc_usuario");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("BTC:");

        lbEth.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lbEth.setText("ethereum_usuario");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("ETHEREUM:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Reais:");

        lbReais.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lbReais.setText("reais_usuario");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Ripple:");

        lbRip.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lbRip.setText("ripple_usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRip, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(lbEth, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbReais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbBtc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbReais))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBtc)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbEth))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbRip))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNome)
                                    .addComponent(lbCpf)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton1)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbCpf))
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


 private ControllerSaldo control;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBtc;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbEth;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbReais;
    private javax.swing.JLabel lbRip;
    // End of variables declaration//GEN-END:variables
}
