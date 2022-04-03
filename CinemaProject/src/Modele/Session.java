/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.Date;



/**
 *
 * @author eric1
 */
public class Session {
    private int sID;
    private String start;
    private String end;
    private String language;
    private Date date;
    
    public Session(int sID,String start, String end, String language, Date date)
    {
        this.sID = sID;
        this.start = start;
        this.end = end;
        this.language = language;
        this.date = date;
    }
    
    public int getSID()
    {
        return sID;
    }
    public String getStart()
    {
        return start;
    }
    public String getEnd()
    {
        return end;
    }
    public String getLanguage()
    {
        return language;
    }
    public Date getDate()
    {
        return date;
    }
}

