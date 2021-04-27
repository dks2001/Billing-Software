/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

 public class dbConnection 
{
    static Connection con;
   static public Connection getConnect()
    {
    String url="jdbc:mysql://localhost:3306/billing_software?autoReconnect=true&useSSL=false";
    
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
                        
            con=DriverManager.getConnection(url,"root","dks2000");
          
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return con;

    }
}
    
    
