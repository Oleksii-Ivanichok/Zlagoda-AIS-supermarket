/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author koles
 */
public class EmployeeDao {
    
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    public int getMaxRow() {
        int row = 0;
        try {
            con = MyConnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select max(id) from employee");
            while (rs.next()) {
                row = rs.getInt(1);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row + 1;
    }
    
    public String[] getEmployeeValue(int Id) {
        String[] value = new String[12];
        try {
            con = MyConnection.getConnection();
            ps = con.prepareStatement("SELECT * FROM employee WHERE id = ?");
            ps.setInt(1, Id);
            rs = ps.executeQuery();
            while (rs.next()) {
                value[0] = rs.getString(1);
                value[1] = rs.getString(2);
                value[2] = rs.getString(3);
                value[3] = rs.getString(4);
                value[4] = rs.getString(5);
                value[5] = rs.getString(6);
                value[6] = rs.getString(7);
                value[7] = rs.getString(8);
                value[8] = rs.getString(9);
                value[9] = rs.getString(10);
                value[10] = rs.getString(11);
                value[11] = rs.getString(12);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }
    
    public int getEmployeeId(String phone) {
        int id = 0;
        try {
            con = MyConnection.getConnection();
            ps = con.prepareStatement("SELECT * FROM employee WHERE phone = ?");
            ps.setString(1, phone);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
