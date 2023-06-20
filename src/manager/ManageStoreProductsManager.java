/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package manager;

import cashier.*;
import java.sql.Connection;
import connection.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.Login;

/**
 *
 * @author koles
 */
public class ManageStoreProductsManager extends javax.swing.JFrame {

    Connection con = MyConnection.getConnection();

    /**
     * Creates new form ManageProducts
     */
    public ManageStoreProductsManager() {
        initComponents();
        init();
    }

    private void init() {
        jComboBox1.addItem("All");
        try {

            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * FROM category");
            ResultSet rs = ps.executeQuery();
            ArrayList<String> categories = new ArrayList<String>();
            while (rs.next()) {
                categories.add(rs.getString(2));
            }
            for (String str : categories) {
                jComboBox1.addItem(str);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage store products");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Price", "Discount", "Quantity", "Category", "Expiration date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setColumnSelectionAllowed(true);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton1.setText("Search by category or/and name");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton2.setText("Not in prom");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 153));
        jButton3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton3.setText("In prom");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 153));
        jButton4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton4.setText("View All");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jButton5.setBackground(new java.awt.Color(255, 255, 153));
        jButton5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton5.setText("Update");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 153));
        jButton6.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton6.setText("Add new");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        DefaultTableModel dm = (DefaultTableModel) jTable3.getModel();
        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }
        String category = String.valueOf(jComboBox1.getSelectedItem());
        String name = jTextField1.getText();
        PreparedStatement ps;
        ResultSet rs;
        try {
            if (category.equals("All") && !name.isEmpty()) {
                ps = con.prepareStatement("SELECT store_product.id AS id, product.name AS name, price, quantity, category.name AS category_name, expiration_date "
                        + "FROM store_product "
                        + "INNER JOIN product ON store_product.fk_product = product.id "
                        + "INNER JOIN category ON product.fk_category = category.id "
                        + "WHERE instr(product.name, ?) > 0 "
                        + "ORDER BY name ASC");
                ps.setString(1, name);
                rs = ps.executeQuery();
            } else if (category.equals("All") && name.isEmpty()) {
                ps = con.prepareStatement("SELECT store_product.id AS id, product.name AS name, price, quantity, category.name AS category_name, expiration_date "
                        + "FROM store_product "
                        + "INNER JOIN product ON store_product.fk_product = product.id "
                        + "INNER JOIN category ON product.fk_category = category.id "
                        + "ORDER BY name ASC");
                rs = ps.executeQuery();
            } else if (!name.isEmpty()) {
                ps = con.prepareStatement("SELECT store_product.id AS id, product.name AS name, price, quantity, category.name AS category_name, expiration_date "
                        + "FROM store_product "
                        + "INNER JOIN product ON store_product.fk_product = product.id "
                        + "INNER JOIN category ON product.fk_category = category.id "
                        + "WHERE instr(product.name, ?) > 0 AND category_name = ? "
                        + "ORDER BY name ASC");
                ps.setString(1, name);
                ps.setString(2, category);
                rs = ps.executeQuery();
            } else {
                ps = con.prepareStatement("SELECT store_product.id AS id, product.name AS name, price, quantity, category.name AS category_name, expiration_date "
                        + "FROM store_product "
                        + "INNER JOIN product ON store_product.fk_product = product.id "
                        + "INNER JOIN category ON product.fk_category = category.id "
                        + "WHERE category_name = ? "
                        + "ORDER BY name ASC");
                ps.setString(1, category);
                rs = ps.executeQuery();
            }
            LocalDate nowDate = LocalDate.now();
            String now = String.valueOf(nowDate);
            while (rs.next()) {
                int productDiscount = 0;
                if (rs.getString("expiration_date").equals(now)) {
                    productDiscount = 20;
                }
                dm.addRow(new Object[]{rs.getString("id"),
                    rs.getString("name"),
                    rs.getString("price"),
                    String.valueOf(productDiscount),
                    rs.getString("quantity"),
                    rs.getString("category_name"),
                    rs.getString("expiration_date")});
            }

        } catch (SQLException ex) {
            Logger.getLogger(CreateCheck.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        DefaultTableModel dm = (DefaultTableModel) jTable3.getModel();
        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }

        PreparedStatement ps;
        ResultSet rs;
        try {

            ps = con.prepareStatement("SELECT store_product.id AS id, product.name AS name, price, quantity, category.name AS category_name, expiration_date "
                    + "FROM store_product "
                    + "INNER JOIN product ON store_product.fk_product = product.id "
                    + "INNER JOIN category ON product.fk_category = category.id "
                    + "ORDER BY name ASC");

            rs = ps.executeQuery();

            LocalDate nowDate = LocalDate.now();
            String now = String.valueOf(nowDate);
            while (rs.next()) {
                int productDiscount = 0;
                if (rs.getString("expiration_date").equals(now)) {
                    productDiscount = 20;
                }
                dm.addRow(new Object[]{rs.getString("id"),
                    rs.getString("name"),
                    rs.getString("price"),
                    String.valueOf(productDiscount),
                    rs.getString("quantity"),
                    rs.getString("category_name"),
                    rs.getString("expiration_date")});
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManageStoreProductsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        System.out.println("in prom");

        
        DefaultTableModel dm = (DefaultTableModel) jTable3.getModel();
        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }

        PreparedStatement ps;
        ResultSet rs;
        try {

            ps = con.prepareStatement("SELECT store_product.id AS id, product.name AS name, price, quantity, category.name AS category_name, expiration_date "
                    + "FROM store_product "
                    + "INNER JOIN product ON store_product.fk_product = product.id "
                    + "INNER JOIN category ON product.fk_category = category.id "
                    + "ORDER BY name ASC, quantity DESC");

            rs = ps.executeQuery();

            LocalDate nowDate = LocalDate.now();
            String now = String.valueOf(nowDate);
            while (rs.next()) {
                int productDiscount = 0;
                if (rs.getString("expiration_date").equals(now)) {
                    productDiscount = 20;
                    dm.addRow(new Object[]{rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("price"),
                        String.valueOf(productDiscount),
                        rs.getString("quantity"),
                        rs.getString("category_name"),
                        rs.getString("expiration_date")});
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManageStoreProductsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        System.out.println("not in prom"+evt.getButton());

        DefaultTableModel dm = (DefaultTableModel) jTable3.getModel();
        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }
        PreparedStatement ps;
        ResultSet rs;
        try {

            ps = con.prepareStatement("SELECT store_product.id AS id, product.name AS name, price, quantity, category.name AS category_name, expiration_date "
                    + "FROM store_product "
                    + "INNER JOIN product ON store_product.fk_product = product.id "
                    + "INNER JOIN category ON product.fk_category = category.id "
                    + "ORDER BY name ASC, quantity DESC");

            rs = ps.executeQuery();

            LocalDate nowDate = LocalDate.now();
            String now = String.valueOf(nowDate);
            while (rs.next()) {
                int productDiscount = 0;
                if (!rs.getString("expiration_date").equals(now)) {

                    dm.addRow(new Object[]{rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("price"),
                        String.valueOf(productDiscount),
                        rs.getString("quantity"),
                        rs.getString("category_name"),
                        rs.getString("expiration_date")});
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManageStoreProductsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        int row = -1;
        row = jTable3.getSelectedRow();
        if (row != -1) {
            PreparedStatement ps;
            ResultSet rs;
            UpdateStoreProduct usp = new UpdateStoreProduct();
            usp.jTextField1.setText(String.valueOf(jTable3.getValueAt(row, 0)));
            usp.jTextField2.setText(String.valueOf(jTable3.getValueAt(row, 1)));
            usp.jTextField3.setText(String.valueOf(jTable3.getValueAt(row, 2)));
            usp.jTextField4.setText(String.valueOf(jTable3.getValueAt(row, 4)));
            LocalDate date = LocalDate.parse(String.valueOf(jTable3.getValueAt(row, 6)));
            Date dat = java.sql.Date.valueOf(date);
            usp.jDateChooser1.setDate(dat);
            usp.setVisible(true);
            this.dispose();
        } else
            JOptionPane.showMessageDialog(this, "Store Product not selected", "Error", 2);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        new AddNewStoreProduct().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageStoreProductsManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStoreProductsManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStoreProductsManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStoreProductsManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStoreProductsManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
