package projecttemp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hari
 */
import java.sql.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import javax.swing.JOptionPane;
public class VacateChange extends javax.swing.JFrame {

    /**
     * Creates new form VacateChange
     */
    private static int flag=1;
    String userid;
    public VacateChange(String id) {
        userid=id;
        initComponents();
        if(flag==1)
       {
           flag=0;
           
           vacateChange();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_reasonforvacating = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_room = new javax.swing.JTextField();
        b_submitvacate = new javax.swing.JButton();
        b_submitroomchange = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_reasonforchanging = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hostel Vacate / Room Change Application");

        jLabel1.setText("Hostel Vacate Form");

        jLabel2.setText("Reason for vacating");

        ta_reasonforvacating.setColumns(20);
        ta_reasonforvacating.setLineWrap(true);
        ta_reasonforvacating.setRows(5);
        jScrollPane1.setViewportView(ta_reasonforvacating);

        jLabel3.setText("Room Change Request");

        jLabel4.setText("Required Room");

        b_submitvacate.setText("Submit Vacate Form");
        b_submitvacate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_submitvacateActionPerformed(evt);
            }
        });

        b_submitroomchange.setText("Submit Room Change Request");
        b_submitroomchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_submitroomchangeActionPerformed(evt);
            }
        });

        jLabel5.setText("Reaon for changing");

        ta_reasonforchanging.setColumns(20);
        ta_reasonforchanging.setLineWrap(true);
        ta_reasonforchanging.setRows(5);
        jScrollPane2.setViewportView(ta_reasonforchanging);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_room, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_submitvacate)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_submitroomchange)
                        .addGap(123, 123, 123))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(b_submitvacate)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(b_submitroomchange)
                .addGap(113, 113, 113))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_submitvacateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_submitvacateActionPerformed
        // TODO add your handling code here:
        
                        try
                        {
                            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy ");  
                        LocalDateTime now = LocalDateTime.now();  
                        String today=dtf.format(now); 
                        String oldroom="1";
                        String reason=ta_reasonforvacating.getText();
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=hari&password=ubuntupassword");
                        Statement st=con.createStatement();
                        PreparedStatement stmt=con.prepareStatement("INSERT INTO `proj`.`ROOM_HOSTEL_CHANGE` (`USER_ID`, `ROOM_HOSTEL`, `CURR_ROOM`, `REQUIRED_ROOM`,`REASON`,`APPLIED_DATE`,`STATUS`) VALUES (?, ?, ?, ?, ?, ?, ?);");
                        stmt.setString(1,userid);
                        stmt.setString(2,"Hostel Vacate");
                        stmt.setString(3,oldroom);
                        stmt.setString(4,null);
                        stmt.setString(5,reason);
                        stmt.setString(6,today);
                        stmt.setString(7,"Pending");
                        int flag1 = stmt.executeUpdate();
                        if(flag1==1)
                            JOptionPane.showMessageDialog(null,"Request Submitted");
                        stmt.close();
                        con.close();
                        }
                        catch(Exception e)
                        {
                             e.getMessage();
                        }
    }//GEN-LAST:event_b_submitvacateActionPerformed

    private void b_submitroomchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_submitroomchangeActionPerformed
        // TODO add your handling code here:
        try
                        {
                            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy ");  
                        LocalDateTime now = LocalDateTime.now();  
                        String today=dtf.format(now); 
                        String oldroom="1";
                        String newroom=tf_room.getText();
                        String reason=ta_reasonforchanging.getText();
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=hari&password=ubuntupassword");
                        Statement st=con.createStatement();
                        PreparedStatement stmt=con.prepareStatement("INSERT INTO `proj`.`ROOM_HOSTEL_CHANGE` (`USER_ID`, `ROOM_HOSTEL`, `CURR_ROOM`, `REQUIRED_ROOM`,`REASON`,`APPLIED_DATE`,`STATUS`) VALUES (?, ?, ?, ?, ?, ?, ?);");
                        stmt.setString(1,userid);
                        stmt.setString(2,"Room Change");
                        stmt.setString(3,oldroom);
                        stmt.setString(4,newroom);
                        stmt.setString(5,reason);
                        stmt.setString(6,today);
                        stmt.setString(7,"Pending");
                        int flag1 = stmt.executeUpdate();
                        if(flag1==1)
                            JOptionPane.showMessageDialog(null,"Request Submitted");
                        stmt.close();
                        con.close();
                        }
                        catch(Exception e)
                        {
                            e.getMessage();
                        }
    }//GEN-LAST:event_b_submitroomchangeActionPerformed

    /**
     * @param args the command line arguments
     */
    public void vacateChange() {
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
            java.util.logging.Logger.getLogger(VacateChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VacateChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VacateChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VacateChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VacateChange(userid).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_submitroomchange;
    private javax.swing.JButton b_submitvacate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea ta_reasonforchanging;
    private javax.swing.JTextArea ta_reasonforvacating;
    private javax.swing.JTextField tf_room;
    // End of variables declaration//GEN-END:variables
}
