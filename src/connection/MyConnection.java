/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author koles
 */
public class MyConnection {
    
    public static final String username = "root";
    public static final String password = "6559";
    public static final String url = "jdbc:sqlite:zlagoda.db";
    public static Connection con = null;
    
    public static Connection getConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(url);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ""+ex, "", JOptionPane.WARNING_MESSAGE);
        }
        
       return con;
    }
}
