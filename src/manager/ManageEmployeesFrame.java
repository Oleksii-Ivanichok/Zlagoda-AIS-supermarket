/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package manager;


import cashier.CreateCheck;
import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.Login;

/**
 *
 * @author admin
 */
public class ManageEmployeesFrame extends javax.swing.JFrame {
    Connection con = MyConnection.getConnection();  
    /**
     * Creates new form ManageEmployeesFrame
     */
    public ManageEmployeesFrame() {
        initComponents();
        init();
    }
    
    public void init() {
        PreparedStatement ps;
        ResultSet rs;
        
        PreparedStatement ps2;
        ResultSet rs2;
        try {
            ps = con.prepareStatement("SELECT * "
                                    + "FROM employee "
                                    + "ORDER BY surname ASC");
            rs = ps.executeQuery();
            
        DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
        while(dm.getRowCount() > 0) {
            dm.removeRow(0);
        }
        
        while(rs.next()){
            dm.addRow(new Object[]{ 
                        rs.getString("id"), 
                        rs.getString("surname"), 
                        rs.getString("name"),
                        rs.getString("patronymic"), 
                        rs.getString("position"),
                        rs.getString("salary"),
                        rs.getString("date_of_birth"),
                        rs.getString("date_of_start"),
                        rs.getString("phone"),
                        rs.getString("city"),
                        rs.getString("street"),
                        rs.getString("zip"),
                        rs.getString("password")});
        }
        
        
        //==============================
        
        ps2 = con.prepareStatement("SELECT * "
                                + "FROM employee "
                                + "WHERE position = 'cashier'"
                                + "ORDER BY surname ASC");
            rs2 = ps2.executeQuery();
            
        DefaultTableModel dm2 = (DefaultTableModel)jTable2.getModel();
        while(dm2.getRowCount() > 0) {
            dm2.removeRow(0);
        }
        
        while(rs2.next()){
            dm2.addRow(new Object[]{ 
                        rs2.getString("id"), 
                        rs2.getString("surname"), 
                        rs2.getString("name"),
                        rs2.getString("patronymic"), 
                        rs2.getString("position"),
                        rs2.getString("salary"),
                        rs2.getString("date_of_birth"),
                        rs2.getString("date_of_start"),
                        rs2.getString("phone"),
                        rs2.getString("city"),
                        rs2.getString("street"),
                        rs2.getString("zip"),
                        rs2.getString("password")});
        }
        }catch (SQLException ex) {
            Logger.getLogger(ManageEmployeesFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        addBotton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        addBotton.setBackground(new java.awt.Color(255, 153, 102));
        addBotton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        addBotton.setText("Add");
        addBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBottonMouseClicked(evt);
            }
        });
        addBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBottonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(255, 153, 102));
        editButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        editButton.setText("Update");
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 153, 102));
        deleteButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Phone", "Adress"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMinWidth(150);
            jTable3.getColumnModel().getColumn(0).setMaxWidth(150);
        }

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("FIND");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "surname", "name", "patronymic", "position", "salary", "date_of_birth", "date_of_start", "phone", "city", "street", "zip", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "surname", "name", "patronymic", "position", "salary", "date_of_birth", "date_of_start", "phone", "city", "street", "zip", "password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("x");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addBotton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(addBotton)
                .addGap(51, 51, 51)
                .addComponent(editButton)
                .addGap(60, 60, 60)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1254, 1254, 1254)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBottonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBottonActionPerformed

    //ADD
    private void addBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBottonMouseClicked
        add_editNewEmployee aen = new add_editNewEmployee();
        aen.mef = this;
        aen.setVisible(true);
    }//GEN-LAST:event_addBottonMouseClicked
    
    //EDIT
    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
        add_editNewEmployee aen = new add_editNewEmployee();
        aen.mef = this;
        aen.addOrEdit = false;
        int row = -1;
        row = jTable1.getSelectedRow();
        if (row == -1){
            row = jTable2.getSelectedRow();
            if (row == -1){
                JOptionPane.showMessageDialog(this, "Choose one row", "Error!",2);
                return;
            } else {
                String id2 = String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 0));
                aen.editedID = id2;
                aen.surname = jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString();
                aen.name = jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString();
                aen.patronymic = jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString();
                aen.position = jTable2.getValueAt(jTable2.getSelectedRow(), 4).toString();
                aen.salary = jTable2.getValueAt(jTable2.getSelectedRow(), 5).toString();
                aen.date_of_birth = jTable2.getValueAt(jTable2.getSelectedRow(), 6).toString();
                aen.date_of_start = jTable2.getValueAt(jTable2.getSelectedRow(), 7).toString();
                aen.phone = jTable2.getValueAt(jTable2.getSelectedRow(), 8).toString();
                aen.city = jTable2.getValueAt(jTable2.getSelectedRow(), 9).toString();
                aen.street = jTable2.getValueAt(jTable2.getSelectedRow(), 10).toString();
                aen.zip = jTable2.getValueAt(jTable2.getSelectedRow(), 11).toString();
                aen.password = jTable2.getValueAt(jTable2.getSelectedRow(), 12).toString();
            }
        } else {
            String id1 = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            aen.editedID = id1;
            aen.surname = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
                aen.name = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
                aen.patronymic = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
                aen.position = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
                aen.salary = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
                aen.date_of_birth = jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString();
                aen.date_of_start = jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString();
                aen.phone = jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString();
                aen.city = jTable1.getValueAt(jTable1.getSelectedRow(), 9).toString();
                aen.street = jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString();
                aen.zip = jTable1.getValueAt(jTable1.getSelectedRow(), 11).toString();
                aen.password = jTable1.getValueAt(jTable1.getSelectedRow(), 12).toString();
                
        }
        aen.prepareForEditing();
        aen.setVisible(true);
    }//GEN-LAST:event_editButtonMouseClicked

    
    // DELETE
    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        PreparedStatement ps;
        ResultSet rs;
        int row = -1;
        row = jTable1.getSelectedRow();
        if (row == -1){
            row = jTable2.getSelectedRow();
            if (row == -1){
                JOptionPane.showMessageDialog(this, "Choose one row", "Error!",2);
                return;
            } else {
                String id = String.valueOf(jTable2.getValueAt(row, 0));
                try {
                    ps = con.prepareStatement("DELETE FROM employee WHERE id = " + id);
                    ps.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(ManageEmployeesFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            String id = String.valueOf(jTable1.getValueAt(row, 0));
                try {
                    ps = con.prepareStatement("DELETE FROM employee WHERE id = " + id);
                    ps.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(ManageEmployeesFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        init();
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        PreparedStatement ps;
        ResultSet rs;
        
        String mySurname = jTextField1.getText();
        
        try{
            ps = con.prepareStatement("SELECT phone, city, street, zip "
                                    + "FROM employee "
                                    + "WHERE surname = ?");
            
            ps.setString(1, mySurname);
            
            rs = ps.executeQuery();
            
        DefaultTableModel dm = (DefaultTableModel)jTable3.getModel();
        while(dm.getRowCount() > 0) {
            dm.removeRow(0);
        }
        
        String resultAdress = rs.getString("city") + ", " + rs.getString("street") + ", " + rs.getString("zip");
        while(rs.next()){
            dm.addRow(new Object[]{ 
                        rs.getString("phone"),
                        resultAdress
            });
        }
            
            
        } catch (SQLException ex) {
                    Logger.getLogger(ManageEmployeesFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmployeesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBotton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
