/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Nelsc_000
 */
import java.sql.*;
import javax.swing.*;

public class conectaBanco {

    public Statement stm;
    public ResultSet rs;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String caminho = "jdbc:mysql://192.168.253.135/SGPolicia";
    private final String usuario = "Alicia";
    private final String senha = "1212";
    public Connection conn;

    public void conexao() {
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null,"Conectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! \n " + ex);
        }

    }

    public void desconecta() {
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar!");
        }
    }

    public static void main(String[] args) {
        conectaBanco conn = new conectaBanco();
        conn.conexao();
    }
}
