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
public class Employee {
    private int empID;
    private String email;
    private String ename;
    private String epassword;
    
    public Employee(int empID, String email, String ename, String epassword)
    {
        this.empID = empID;
        this.email = email;
        this.ename = ename;
        this.epassword = epassword;
    }
}


