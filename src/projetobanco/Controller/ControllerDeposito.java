/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobanco.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projetobanco.DAO.Conexao;
import projetobanco.DAO.UsuarioDAO;
import projetobanco.Model.Usuario;
import projetobanco.View.JanelaDeposito;
import java.sql.PreparedStatement;


/**
 *
 * @author Pedro Satoru
 */
public class ControllerDeposito {
    private JanelaDeposito view;

    public ControllerDeposito(JanelaDeposito view) {
        this.view = view;
    }
    

        
public void depositar(Usuario usuario, double valorDeposito) throws SQLException {
    Conexao conexao = new Conexao();
    Connection conn = conexao.getConnection();

    String sqlSelect = "SELECT reais FROM public.usuario WHERE cpf = ?";
    String sqlUpdate = "UPDATE public.usuario SET reais = ? WHERE cpf = ?";
    try (PreparedStatement statementSelect = conn.prepareStatement(sqlSelect)) {
            statementSelect.setString(1, usuario.getCpf());
            ResultSet resultSet = statementSelect.executeQuery();

            if (resultSet.next()) {
                double valorAtual = resultSet.getDouble("reais");
                double valorNovo = valorAtual + valorDeposito;

                try (PreparedStatement statementUpdate = conn.prepareStatement(sqlUpdate)) {
                    statementUpdate.setDouble(1, valorNovo);
                    statementUpdate.setString(2, usuario.getCpf());
                    statementUpdate.executeUpdate();
                }
            }
        } finally {
            conn.close();
        }
    }
}
