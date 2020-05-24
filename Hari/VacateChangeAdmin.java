/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttemp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author hari
 */
public class VacateChangeAdmin extends javax.swing.JFrame {

    /**
     * Creates new form VacateorChange
     */
    public VacateChangeAdmin() {
        initComponents();
        fetch1();
        fetch2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        t_hostelvacaterecord = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_reqno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        b_update = new javax.swing.JButton();
        cb_status = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cb_selectfrom = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_roomchangerecord = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hostel Vacate/Room Change Requests");
        setResizable(false);

        t_hostelvacaterecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(t_hostelvacaterecord);

        jLabel1.setText("Hostel Vacate Register");

        jLabel2.setText("Update a Request");

        jLabel3.setText("Enter request number");

        jLabel4.setText("Status");

        b_update.setText("Update");
        b_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_updateActionPerformed(evt);
            }
        });

        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Under Process", "Accepted", "Rejected" }));

        jLabel5.setText("Select From");

        cb_selectfrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hostel Vacate", "Room Change" }));

        t_roomchangerecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(t_roomchangerecord);

        jLabel6.setText("Room Change Register");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(b_update, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_reqno)
                            .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_selectfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(cb_selectfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(tf_reqno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(b_update)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fetch1()
   {
     try
     {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=hari&password=ubuntupassword");
         Statement st=con.createStatement();
         PreparedStatement pst=con.prepareStatement("select REQ_NO,USER_ID,REASON,APPLIED_DATE,STATUS from proj.HOSTEL_CHANGE");
         ResultSet rs=pst.executeQuery();
         t_hostelvacaterecord.setModel(DbUtils.resultSetToTableModel(rs));
         
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e);
     }
   }
    public void fetch2()
   {
     try
     {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=hari&password=ubuntupassword");
         Statement st=con.createStatement();
         PreparedStatement pst=con.prepareStatement("select REQ_NO,USER_ID,REQUIRED_ROOM,REASON,APPLIED_DATE,STATUS from proj.ROOM_CHANGE");
         ResultSet rs=pst.executeQuery();
         t_roomchangerecord.setModel(DbUtils.resultSetToTableModel(rs));
         
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e);
     }
   }
    private void b_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_updateActionPerformed
        // TODO add your handling code here:
        try {
                        String status=cb_status.getItemAt(cb_status.getSelectedIndex());
                        String select=cb_selectfrom.getItemAt(cb_selectfrom.getSelectedIndex());
                        String requestnum=tf_reqno.getText();
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=hari&password=ubuntupassword");
                        Statement st=con.createStatement();
                        PreparedStatement stmt;
                        if(select.equals("Hostel Vacate"))
                        {
                            stmt=con.prepareStatement("UPDATE `proj`.`HOSTEL_CHANGE` SET `STATUS` = ? WHERE (`REQ_NO` = ?);");

                        }
                        else
                        {
                             stmt=con.prepareStatement("UPDATE `proj`.`ROOM_CHANGE` SET `STATUS` = ? WHERE (`REQ_NO` = ?);");

                        }
                        stmt.setString(1,status);
                        stmt.setString(2,requestnum);
                        int flag1 = stmt.executeUpdate();
                        if(flag1==1)
                            JOptionPane.showMessageDialog(null,"Status Updated");
                        stmt.close();
                        con.close();
                        
                    
                
            }catch(SQLException s)
            {
                System.out.println("SQL Exception "+s.getStackTrace()[0].getLineNumber()+s.getMessage());
            }catch(Exception e)
            {
                System.out.println("Exception "+e.toString());
            }
            fetch1();fetch2();
        
    }//GEN-LAST:event_b_updateActionPerformed

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
            java.util.logging.Logger.getLogger(VacateChangeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VacateChangeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VacateChangeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VacateChangeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VacateChangeAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_update;
    private javax.swing.JComboBox<String> cb_selectfrom;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable t_hostelvacaterecord;
    private javax.swing.JTable t_roomchangerecord;
    private javax.swing.JTextField tf_reqno;
    // End of variables declaration//GEN-END:variables
}