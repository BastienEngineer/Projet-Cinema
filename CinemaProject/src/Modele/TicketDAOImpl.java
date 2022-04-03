/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;
import Controleur.Connexion;
import Modele.Session;
import Modele.Movie;
import java.sql.SQLException;
/**
 *
 * @author louis
 */
public class TicketDAOImpl implements TicketDAO{
    public void creationTicket(int t,Session s,Movie m)
    {
        try {
            String url = "jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false";
            String login = "root";
            String mdp = "";
            Connexion con = new Connexion(url, login, mdp);
            con.stmt = con.conn.createStatement();
            con.stmt.executeUpdate("Insert into ticket values (null, '" + t + "', '" + s.getSID() + "', '" + m.getname() + "');");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
