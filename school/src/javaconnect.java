/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */

import java.sql.*;
import javax.swing.JOptionPane;

class javaconnect {
    Connection conn;
    
    public static Connection ConnecrDb(){
            try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","");
                    return conn;
        
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
            
    }

    static class sql {

        public sql() {
        }
    }
    
}
