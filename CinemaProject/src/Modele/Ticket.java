/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

/**
 *
 * @author louis
 */
public class Ticket {
    private int Nbticket;
    private int price;
    private int sID;
    private String mname;
    
    public Ticket(int Nbticket, int price, int sID, String mname)
    {
        this.Nbticket=Nbticket;
        this.price=price;
        this.sID=sID;
        this.mname=mname;
    }
    
    public int getNb()
    {
        return Nbticket;
    }
    public int getprice()
    {
        return price;
    }
    public int getsID()
    {
        return sID;
    }
    public String getMovieName()
    {
        return mname;
    }
    
}
