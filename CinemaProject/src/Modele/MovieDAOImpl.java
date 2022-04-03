/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import Controleur.Connexion;
import java.sql.SQLException;

/**
 *
 * @author eric1
 */
public class MovieDAOImpl implements MovieDAO {
    public Movie setMovie( Movie m, int nb )
    {
        try {
            String url = "jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false";
            String login = "root";
            String mdp = "";
            Connexion con = new Connexion(url, login, mdp);
            con.stmt = con.conn.createStatement();
            con.executequery("Select * From movie Where mID=" +nb+";");
            if (con.rset.next()) {
                m = new Movie(con.rset.getInt("mID"),con.rset.getString("movieName"),con.rset.getString("mGenre"),con.rset.getString("mHour"),con.rset.getString("mActor"),con.rset.getString("mDirector"),con.rset.getBytes("mPoster"),con.rset.getString("mPath"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return m;
    }
}
