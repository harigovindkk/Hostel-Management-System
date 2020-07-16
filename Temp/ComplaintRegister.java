package projecttemp;


import java.sql.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
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
public class ComplaintRegister extends javax.swing.JFrame {

    /**
     * Creates new form ComplaintRegister
     */
   //private static int flag=1;
   String userid;
   public ComplaintRegister(String id) {
       userid=id;
       initComponents();
//       if(flag==1)
//       {
//           flag=0;
//           
//           dofunction();
//       }
       fetch();
   }
    public void fetch()
   {
     try
     {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=hari&password=ubuntupassword");
         PreparedStatement pst=con.prepareStatement("select C_NUM,RELATED_TO,DETAILS,DATE_TIME,STATUS from proj.COMPLAINT_REG where USER_ID= ? ");
         pst.setString(1,userid);
         ResultSet rs=pst.executeQuery();
         t_previouscomplaints.setModel(DbUtils.resultSetToTableModel(rs));
         
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e);
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
        setResizable(false);
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cb_relatedto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_details = new javax.swing.JTextArea();
        b_submit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t_previouscomplaints = new javax.swing.JTable();

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Complaint Register");

        jLabel1.setText("Complaint Related to");

        cb_relatedto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Maintanence", "Staff" }));
        cb_relatedto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_relatedtoActionPerformed(evt);
            }
        });

        jLabel2.setText("New Complaint");

        jLabel3.setText("Enter details");

        ta_details.setColumns(20);
        ta_details.setLineWrap(true);
        ta_details.setRows(5);
        jScrollPane1.setViewportView(ta_details);

        b_submit.setText("Submit");
        b_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_submitActionPerformed(evt);
            }
        });

        jLabel4.setText("Your Previous Complaints");

        t_previouscomplaints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Complaint Number", "Date", "Details", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(t_previouscomplaints);
        if (t_previouscomplaints.getColumnModel().getColumnCount() > 0) {
            t_previouscomplaints.getColumnModel().getColumn(0).setHeaderValue("Complaint Number");
            t_previouscomplaints.getColumnModel().getColumn(1).setHeaderValue("Date");
            t_previouscomplaints.getColumnModel().getColumn(2).setHeaderValue("Details");
            t_previouscomplaints.getColumnModel().getColumn(3).setHeaderValue("Status");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(90, 90, 90))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(145, 145, 145)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_relatedto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(b_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_relatedto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(b_submit)
                .addGap(54, 54, 54)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_relatedtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_relatedtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_relatedtoActionPerformed

    private void b_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_submitActionPerformed

try {
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy ");  
                        LocalDateTime now = LocalDateTime.now();  
                        String today=dtf.format(now); 
                        String number="1";
                        String relatedto=cb_relatedto.getItemAt(cb_relatedto.getSelectedIndex());
                        String details=ta_details.getText();
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=hari&password=ubuntupassword");
                        Statement st=con.createStatement();
                        PreparedStatement stmt=con.prepareStatement("INSERT INTO `proj`.`COMPLAINT_REG` (`C_NUM`, `USER_ID`, `RELATED_TO`, `DETAILS`,`DATE_TIME`,`STATUS`) VALUES (?, ?, ?, ?, ?, ?);");
                        stmt.setString(1,null);
                        stmt.setString(2,userid);
                        stmt.setString(3,relatedto);
                        stmt.setString(4,details);
                        stmt.setString(5,today);
                        stmt.setString(6,"Pending");
                        int flag1 = stmt.executeUpdate();
                        if(flag1==1)
                            JOptionPane.showMessageDialog(null,"Complaint Submitted");
                        stmt.close();
                        con.close();
                    
                
            }catch(SQLException s)
            {
                System.out.println("SQL Exception "+s.getStackTrace()[0].getLineNumber()+s.getMessage());
            }catch(Exception e)
            {
                System.out.println("Exception "+e.toString());
            }
            fetch();
    }//GEN-LAST:event_b_submitActionPerformed

    /**
     */
//    public void dofunction() {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ComplaintRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ComplaintRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ComplaintRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ComplaintRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ComplaintRegister(userid).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_submit;
    private javax.swing.JComboBox<String> cb_relatedto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable t_previouscomplaints;
    private javax.swing.JTextArea ta_details;
    // End of variables declaration//GEN-END:variables
    public int complaint_num=1;
}
