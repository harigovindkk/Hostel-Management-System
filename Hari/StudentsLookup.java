package projecttemp;


import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hari
 */
public class StudentsLookup extends javax.swing.JFrame {

    /**
     * Creates new form StudentsLookup
     */
    private static int flag=1;
    public StudentsLookup() {
        initComponents();
        if(flag==1)
       {
           flag=0;
           
           dofunction();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b_searchbyname = new javax.swing.JButton();
        tf_name = new javax.swing.JTextField();
        tf_roomnumber = new javax.swing.JTextField();
        b_searchbyroom = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf_userid = new javax.swing.JTextField();
        b_searchbyuserid = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_result = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Students Lookup");

        jLabel2.setText("Enter Name");

        jLabel4.setText("Enter Room Number");

        b_searchbyname.setText("Search By Name");
        b_searchbyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_searchbynameActionPerformed(evt);
            }
        });

        b_searchbyroom.setText("Search By  Room");
        b_searchbyroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_searchbyroomActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter User ID");

        b_searchbyuserid.setText("Search By User ID");
        b_searchbyuserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_searchbyuseridActionPerformed(evt);
            }
        });

        jLabel3.setText("Result");

        t_result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(t_result);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addComponent(b_searchbyname))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(jLabel2)
                            .addGap(59, 59, 59)
                            .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(27, 27, 27)
                                    .addComponent(tf_roomnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(58, 58, 58)
                                    .addComponent(tf_userid, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(106, 106, 106)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(b_searchbyroom))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(b_searchbyuserid))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_searchbyname)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_roomnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_searchbyroom)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tf_userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_searchbyuserid)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_searchbynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_searchbynameActionPerformed
        // TODO add your handling code here:
        try {
                
                        String name=tf_name.getText();
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=hari&password=ubuntupassword");
                        Statement st=con.createStatement();
                        int flag=0;
                        PreparedStatement stmt=con.prepareStatement("select NAME, REG_NO, PHONE_NUMBER from proj.STUDENTLIST where NAME='"+ name + "';");
                        ResultSet rs= stmt.executeQuery();
                        t_result.setModel(DbUtils.resultSetToTableModel(rs));
                        if(rs!=null)
                            JOptionPane.showMessageDialog(null,"Student found");
                        stmt.close();
                        con.close();
                    }
                
            catch(SQLException s)
            {
                System.out.println("SQL Exception "+s.getStackTrace()[0].getLineNumber()+s.getMessage());
            }catch(Exception e)
            {
                System.out.println("Exception "+e.toString());
            }
    }//GEN-LAST:event_b_searchbynameActionPerformed

    private void b_searchbyroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_searchbyroomActionPerformed
        // TODO add your handling code here:
        try {
                
                        String room=tf_roomnumber.getText();
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=hari&password=ubuntupassword");
                        Statement st=con.createStatement();
                        int flag=0;
                        PreparedStatement stmt=con.prepareStatement("select NAME, REG_NO, PHONE_NUMBER from proj.STUDENTLIST where REG_NO='"+ room + "';");
                        ResultSet rs= stmt.executeQuery();
                        t_result.setModel(DbUtils.resultSetToTableModel(rs));
                        if(rs!=null)
                            JOptionPane.showMessageDialog(null,"Student found");
                        stmt.close();
                        con.close();
                    }
                
            catch(SQLException s)
            {
                System.out.println("SQL Exception "+s.getStackTrace()[0].getLineNumber()+s.getMessage());
            }catch(Exception e)
            {
                System.out.println("Exception "+e.toString());
            }
        
    }//GEN-LAST:event_b_searchbyroomActionPerformed

    private void b_searchbyuseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_searchbyuseridActionPerformed
        // TODO add your handling code here:
        try {
                
                        String regno=tf_userid.getText();
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=hari&password=ubuntupassword");
                        Statement st=con.createStatement();
                        int flag=0;
                        PreparedStatement stmt=con.prepareStatement("select NAME, REG_NO, PHONE_NUMBER from proj.STUDENTLIST where REG_NO='"+ regno + "';");
                        ResultSet rs= stmt.executeQuery();
                        t_result.setModel(DbUtils.resultSetToTableModel(rs));
                        if(rs!=null)
                            JOptionPane.showMessageDialog(null,"Student found");
                        stmt.close();
                        con.close();
                    }
                
            catch(SQLException s)
            {
                System.out.println("SQL Exception "+s.getStackTrace()[0].getLineNumber()+s.getMessage());
            }catch(Exception e)
            {
                System.out.println("Exception "+e.toString());
            }
    }//GEN-LAST:event_b_searchbyuseridActionPerformed

    /**
     * @param args the command line arguments
     */
    public void dofunction() {
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
            java.util.logging.Logger.getLogger(StudentsLookup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsLookup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsLookup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsLookup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsLookup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_searchbyname;
    private javax.swing.JButton b_searchbyroom;
    private javax.swing.JButton b_searchbyuserid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tf_userid;
    private javax.swing.JTable t_result;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_roomnumber;
    // End of variables declaration//GEN-END:variables
    //private String name;
}
