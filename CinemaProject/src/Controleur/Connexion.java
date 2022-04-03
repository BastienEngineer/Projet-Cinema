/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import java.sql.*;
/**
 *
 * @author louis
 */
public class Connexion {
    public Connection conn;
    public Statement stmt;
    public ResultSet rset;
    public ResultSetMetaData rsetMeta;
    public String url, login, mdp;
    
    public Connexion(String nameDatabase, String loginDatabase, String passwordDatabase) {
        try{ 
        conn = DriverManager.getConnection(nameDatabase, loginDatabase, passwordDatabase);
        stmt = conn.createStatement();
        }
        catch(SQLException e){
            System.out.print(e); 
        }
    }
    public void executequery(String sql) throws SQLException {
        rset=stmt.executeQuery(sql);
    }
}
