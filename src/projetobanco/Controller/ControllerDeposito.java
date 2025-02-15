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

    /**
     *
     * @param view
     */
    public ControllerDeposito(JanelaDeposito view) {
        this.view = view;
    }
    
    /**
     *
     * @param usuario
     * @param valorDeposito
     * @throws SQLException
     */
    public void depositar(Usuario usuario, double valorDeposito) throws SQLException {
    Conexao conexao = new Conexao();
    Connection conn = conexao.getConnection();

    String sqlSelect = "SELECT reais FROM public.usuario WHERE cpf = ?";
    String sqlUpdate = "UPDATE public.usuario SET reais = ? WHERE cpf = ?";
    String sqlInsertTransacao = "INSERT INTO public.transacao (cpf, data_hora, tipo, valor, cotacao, taxa, saldo_reais, saldo_btc, saldo_eth, saldo_xrp, moeda) VALUES (?, CAST(TO_CHAR(CURRENT_TIMESTAMP, 'YYYY-MM-DD HH24:MI:SS') AS TIMESTAMP), ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
                try (PreparedStatement statementInsertTransacao = conn.prepareStatement(sqlInsertTransacao)) {
                    statementInsertTransacao.setString(1, usuario.getCpf());
                    statementInsertTransacao.setString(2, "+");
                    statementInsertTransacao.setDouble(3, valorDeposito);
                    statementInsertTransacao.setDouble(4, 0.0); // Cotação (ajuste conforme necessário)
                    statementInsertTransacao.setDouble(5, 0.0); // Taxa (ajuste conforme necessário)
                    statementInsertTransacao.setDouble(6, valorNovo);
                    statementInsertTransacao.setDouble(7, usuario.getBtc());
                    statementInsertTransacao.setDouble(8, usuario.getEth());
                    statementInsertTransacao.setDouble(9, usuario.getRip());
                    statementInsertTransacao.setString(10, "REAL");
                    
                    statementInsertTransacao.executeUpdate();
                }
            }
        } finally {
            conn.close();
        }
    }
}
