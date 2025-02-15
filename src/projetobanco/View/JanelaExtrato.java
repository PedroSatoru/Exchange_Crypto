/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetobanco.View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import projetobanco.Model.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import projetobanco.Controller.ControllerExtrato;
import projetobanco.DAO.Conexao;
import projetobanco.Model.Usuario;
import projetobanco.Controller.ControllerExtrato;
/**
 *
 * @author Pedro Satoru
 */
public class JanelaExtrato extends javax.swing.JFrame {

    private Usuario usuario;
    private Connection conn;
    
    /**
     *
     * @param usuario
     * @throws SQLException
     */
    public JanelaExtrato(Usuario usuario) throws SQLException {
        this.usuario = usuario;
        Conexao conexao = new Conexao();
        this.conn = conexao.getConnection();
        this.control = new ControllerExtrato(conn);
        initComponents();
    }

    /**
     *
     * @return
     */
    public JButton getjButton1() {
        return jButton1;
    }

    /**
     *
     * @param jButton1
     */
    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
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
    public JScrollPane getTxtExtrato() {
        return txtExtrato;
    }

    /**
     *
     * @param txtExtrato
     */
    public void setTxtExtrato(JScrollPane txtExtrato) {
        this.txtExtrato = txtExtrato;
    }

    /**
     *
     * @return
     */
    public JTextArea getTxtExtrato1() {
        return txtExtrato1;
    }

    /**
     *
     * @param txtExtrato1
     */
    public void setTxtExtrato1(JTextArea txtExtrato1) {
        this.txtExtrato1 = txtExtrato1;
    }

    /**
     *
     * @return
     */
    public JTextField getTxtSenha() {
        return txtSenha;
    }

    /**
     *
     * @param txtSenha
     */
    public void setTxtSenha(JTextField txtSenha) {
        this.txtSenha = txtSenha;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtExtrato = new javax.swing.JScrollPane();
        txtExtrato1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtExtrato1.setColumns(20);
        txtExtrato1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtExtrato1.setRows(5);
        txtExtrato.setViewportView(txtExtrato1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Digite sua Senha novamente");

        txtSenha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Ver Extrato");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btVoltar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtExtrato, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btVoltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btVoltar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //Verifica a senha do usuario, caso esteja correta chama a função de mostrar extratos
        if (usuario.getSenha().equals(new String(txtSenha.getText()))) {
            control.mostrarExtrato(this, usuario);
        } else {
            JOptionPane.showMessageDialog(this, "Senha incorreta!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed


private ControllerExtrato control;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane txtExtrato;
    private javax.swing.JTextArea txtExtrato1;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
