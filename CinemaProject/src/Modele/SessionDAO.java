/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.ArrayList;

/**
 *
 * @author eric1
 */
public interface SessionDAO {
    public ArrayList<Session> addSession(ArrayList<Session> s, Movie m, int choix);
     public Session addSession(Session s, int nb);
}
