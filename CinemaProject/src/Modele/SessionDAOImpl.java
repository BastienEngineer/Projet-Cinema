/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import Controleur.Connexion;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author eric1
 */
public class SessionDAOImpl implements SessionDAO {

    public ArrayList<Session> addSession(ArrayList<Session> s, Movie m, int choix) {
        try {
            String url = "jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false";
            String login = "root";
            String mdp = "";
            Connexion con = new Connexion(url, login, mdp);
            con.stmt = con.conn.createStatement();
            con.executequery("Select * From movie Where mID="+choix+";");
            if (con.rset.next()) {
                m = new Movie(con.rset.getInt("mID"), con.rset.getString("movieName"), con.rset.getString("mGenre"), con.rset.getString("mHour"), con.rset.getString("mActor"), con.rset.getString("mDirector"), con.rset.getBytes("mPoster"),con.rset.getString("mPath"));
            }
            con.executequery("Select * From seance Where mID="+choix+";");
            while (con.rset.next()) {
                Session session = new Session(con.rset.getInt("sID"), con.rset.getString("startTime"), con.rset.getString("endTime"), con.rset.getString("language"), con.rset.getDate("date"));
                s.add(session);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return s;
    }
    public Session addSession(Session s, int nb)
    {
        try {
            String url = "jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false";
            String login = "root";
            String mdp = "";
            Connexion con = new Connexion(url, login, mdp);
            con.stmt = con.conn.createStatement();
            con.executequery("Select * From seance Where sID=" + nb + ";");
            if (con.rset.next()) {
                s = new Session(con.rset.getInt("sID"), con.rset.getString("startTime"), con.rset.getString("endTime"), con.rset.getString("language"), con.rset.getDate("date"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return s;
    }
    
}
