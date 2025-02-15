/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobanco.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projetobanco.DAO.UsuarioDAO;
import projetobanco.Model.Usuario;
import projetobanco.View.JanelaExtrato;

/**
 *
 * @author Pedro Satoru
 */
public class ControllerExtrato {
    private UsuarioDAO usuarioDAO;

    /**
     *
     * @param conn
     */
    public ControllerExtrato(Connection conn) {
        this.usuarioDAO = new UsuarioDAO(conn);
    }

    /**
     *
     * @param janela
     * @param usuario
     */
    public void mostrarExtrato(JanelaExtrato janela, Usuario usuario) {
        try {
            //conexão com o banco de dados
            ResultSet rs = usuarioDAO.ConsultaExtrato(usuario.getCpf());
            StringBuilder extrato = new StringBuilder();

            while (rs.next()) {
                //recebe os valores da tabela da tabela e fica rodando atea cabar as operaçãoes do usuario
                String dataHora = rs.getString("data_hora");
                String tipo = rs.getString("tipo");
                double valor = rs.getDouble("valor");
                double cotacao = rs.getDouble("cotacao");
                double taxa = rs.getDouble("taxa");
                double saldoReais = rs.getDouble("saldo_reais");
                double saldoBtc = rs.getDouble("saldo_btc");
                double saldoEth = rs.getDouble("saldo_eth");
                double saldoXrp = rs.getDouble("saldo_xrp");
                String moeda = rs.getString("moeda");
                
                //formatação do print de extrato
                extrato.append(String.format("%s   %s   %.2f  %s  CT: %.2f  TX: %.2f  REAL: %.2f  BTC: %.8f  ETH: %.8f   RIP: %.8f\n",
                        dataHora, tipo, valor, moeda, cotacao, taxa, saldoReais, saldoBtc, saldoEth, saldoXrp));
            }

            janela.getTxtExtrato1().setText(extrato.toString());

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(janela, "Erro ao consultar o extrato: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}


    
