/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.sql.*;  //Package Loading 

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            // c =DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem","root","Pp@123456"); 
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem","root","Sanket@180"); 
            s =c.createStatement();  
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  

