/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;
/**
 *
 * @author louis
 */
public class Movie {
    private int mID;
    private String name,genre,hour,actor,director,path;
    private byte[] poster;
    
    public Movie(int mID, String name, String genre, String hour, String actor, String director, byte[] poster,String path)
    {
        this.mID=mID;
        this.name=name;
        this.genre=genre;
        this.hour=hour;
        this.actor=actor;
        this.director=director;
        this.poster=poster;
        this.path=path;
    }
    public int getID()
    {
        return mID;
    }
    public String getname()
    {
        return name;
    }
    public String getgenre()
    {
        return genre;
    }
    public String gethour()
    {
        return hour;
    }
    public String getactor()
    {
        return actor;
    }
    public String getdirector()
    {
        return director;
    }
    public byte[] getposter()
    {
        return poster;
    }
    public String getpath()
    {
        return path;
    }
}
