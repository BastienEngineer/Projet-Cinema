/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author eric1
 */
public class Member {
    private String name;
    private String password;
    private int price;
    private String type;
    
    public Member(String name, String password, int price, String type)
    {
        this.name = name;
        this.password = password;
        this.price = price;
        this.type = type;
    }
    
    public String getName()
    {
        return name;
    }
    public String getPassword()
    {
        return password;
    }
    public int getPrice()
    {
        return price;
    }
    public String getType()
    {
        return type;
    }
}
