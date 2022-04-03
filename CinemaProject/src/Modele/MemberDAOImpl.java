/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import Controleur.Connexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author eric1
 */
public class MemberDAOImpl implements MemberDAO {
    public Member setMember(String username, String password, Member m)
    {
        try{
            String url="jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false";
            String login="root";
            String mdp="";
            Connexion con= new Connexion(url,login,mdp);
            con.stmt = con.conn.createStatement();
            con.executequery("Select * From member Where mname='"+username+"' And mpassword='"+password+"';");
            if(con.rset.next()){
                JOptionPane.showMessageDialog(null,"Login successful");
                m = new Member(con.rset.getString("mname"), con.rset.getString("mpassword"), con.rset.getInt("mprice"), con.rset.getString("mtype"));
            }
            else{
                JOptionPane.showMessageDialog(null,"The username or password is incorrect");
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return m;
    }

    public void creationMember(Member m) {
        try {
            String url = "jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false";
            String login = "root";
            String mdp = "";
            Connexion con = new Connexion(url, login, mdp);
            con.stmt = con.conn.createStatement();
            con.stmt.executeUpdate("Insert into member values ('" + m.getName() + "', '" + m.getPassword() + "', '" + m.getPrice() + "', '" + m.getType() + "');");
            JOptionPane.showMessageDialog(null, "New member created : Welcome !");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
