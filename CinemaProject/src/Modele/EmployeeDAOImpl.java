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
public class EmployeeDAOImpl implements EmployeeDAO {
    public Employee setEmployee(String username, String password, Employee emp)
    {
        try{
            String url="jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false";
            String login="root";
            String mdp="";
            Connexion con= new Connexion(url,login,mdp);
            con.stmt = con.conn.createStatement();
            con.executequery("Select * From employee Where ename='"+username+"' And epassword='"+password+"';");
            if(con.rset.next()){
                JOptionPane.showMessageDialog(null,"Login successful");
                emp = new Employee(con.rset.getInt("empID"), con.rset.getString("email"),con.rset.getString("ename"), con.rset.getString("epassword"));
            }
            else{
                JOptionPane.showMessageDialog(null,"The username or password is incorrect");
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return emp;
    }
}
