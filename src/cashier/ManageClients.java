/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cashier;

import connection.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author koles
 */
public class ManageClients extends javax.swing.JFrame {

    Connection con = MyConnection.getConnection();
    /**
     * Creates new form ManageClients
     */
    public ManageClients() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage Clients");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Surname", "Patronymic", "Phone", "Adress", "Discount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton1.setText("Search by surname");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 153));
        jButton3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton3.setText("View All");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton2.setText("Update");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 153));
        jButton4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton4.setText("Add new");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
        while(dm.getRowCount() > 0) {
            dm.removeRow(0);
        }
        PreparedStatement ps;
        ResultSet rs;
        try {
            
                 ps = con.prepareStatement("SELECT * "
                                         + "FROM client "
                                         + "ORDER BY surname ASC");
                
                 rs = ps.executeQuery();
            
            while(rs.next()) {
          
                String adress = "";
                if ((rs.getString("city") !=  null && !rs.getString("city").isEmpty()) 
                        && (rs.getString("street") !=  null && !rs.getString("street").isEmpty())
                        && (rs.getString("zip") !=  null && !rs.getString("zip").isEmpty())) {
                    adress = rs.getString("city") + ", " + rs.getString("street") + ", " + rs.getString("zip");
                }
                dm.addRow(new Object[]{
                    rs.getString("id"),
                    rs.getString("surname"),
                    rs.getString("name"),
                    rs.getString("patronymic"),
                    rs.getString("phone"),
                    adress,
                    rs.getString("percent"),
                });
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(ManageStoreProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                     

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {                                      
         
    }                                     

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {                                      
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
        while(dm.getRowCount() > 0) {
            dm.removeRow(0);
        }
        String surname = jTextField1.getText();
        PreparedStatement ps;
        ResultSet rs;
        try {
            if (!surname.isEmpty()) {
                ps = con.prepareStatement("SELECT * FROM client WHERE instr(surname, ?) > 0 ORDER BY surname ASC");
                ps.setString(1,surname);
                rs = ps.executeQuery();
                while (rs.next()) {
                    String adress = "";
                if (rs.getString("city") !=  null && rs.getString("street") != null && rs.getString("zip") != null) {
                    adress = rs.getString("city") + ", " + rs.getString("street") + ", " + rs.getString("zip");
                }
                    dm.addRow(new Object[]{
                    rs.getString("id"),
                    rs.getString("surname"),
                    rs.getString("name"),
                    rs.getString("patronymic"),
                    rs.getString("phone"),
                    adress,
                    rs.getString("percent"),
                });
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ManageClients.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        new NewClient().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        int row = -1;
       
        row = jTable1.getSelectedRow();
        if (row != -1) {
            UpdateClient uc = new UpdateClient();
            uc.oldPhone = String.valueOf(jTable1.getValueAt(row, 4));
            uc.jTextField1.setText(String.valueOf(jTable1.getValueAt(row, 0)));
            uc.jTextField2.setText(String.valueOf(jTable1.getValueAt(row, 1)));
            uc.jTextField3.setText(String.valueOf(jTable1.getValueAt(row, 2)));
            if (!String.valueOf(jTable1.getValueAt(row, 3)).isEmpty() || String.valueOf(jTable1.getValueAt(row, 3)) != null) {
                uc.jTextField4.setText(String.valueOf(jTable1.getValueAt(row, 3)));
            }
            
            uc.jTextField5.setText(String.valueOf(jTable1.getValueAt(row, 4)));
            uc.jTextField9.setText(String.valueOf(jTable1.getValueAt(row, 6)));
            if (!String.valueOf(jTable1.getValueAt(row, 5)).isEmpty()) {
                PreparedStatement ps;
                ResultSet rs;
                try {
            
                    ps = con.prepareStatement("SELECT * FROM client WHERE id = ?");
                    ps.setString(1, String.valueOf(jTable1.getValueAt(row, 0)));

                    rs = ps.executeQuery();
                    if (rs.next()) {
                        uc.jTextField6.setText(rs.getString("city"));
                        uc.jTextField7.setText(rs.getString("street"));
                        uc.jTextField8.setText(rs.getString("zip"));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ManageClients.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
                    

            uc.setVisible(true);
            this.dispose();
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ManageClients.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else JOptionPane.showMessageDialog(this, "Client not selected", "Error", 2);
        
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(ManageClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageClients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
