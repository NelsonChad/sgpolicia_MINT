/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.conectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DETEC_IT
 */
public class UsersConectados {
    
    conectaBanco connect = new conectaBanco();
    
    public String connectado() throws SQLException {
        connect.conexao();

        PreparedStatement user;
            user = connect.conn.prepareStatement("select * from connectados");
            connect.rs = user.executeQuery();
            connect.rs.last();
            String usr = connect.rs.getString("nome_conectado");
            return usr;
            //JOptionPane.showMessageDialog(null,"Oconnectado e' "+user);
    } 
    public String Esquadra() throws SQLException {
        connect.conexao();

        PreparedStatement esc;
            esc = connect.conn.prepareStatement("select * from utilizadores where nome =? ");
            String nome = connectado();
            esc.setString(1, nome);
            
            
            connect.rs = esc.executeQuery();
            connect.rs.last();
            String esquadra = connect.rs.getString("Esquadra");
            return esquadra;
            //JOptionPane.showMessageDialog(null,"Oconnectado e' "+user);
    } 
    
   /* public static void main(String[] args) throws SQLException {
        UsersConectados u = new UsersConectados();
        System.out.println("utilizador "+u.connectado());
        System.out.println("Esquadra "+u.Esquadra());
    }*/
}
