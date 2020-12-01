package hari;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.text.*;


/**
 *
 * @author hari
 */
public class MessReduction extends javax.swing.JFrame {

   
   public MessReduction(String id) {

       initComponents(id);
       fetch();
   }
    public void fetch() {
        try {
            con=new Connector().getCon();
            stmt=con.prepareStatement("select REQ_NO,FROM_DATE, TO_DATE,DATE_SUBMITTED,STATUS from proj.MESS_REDUCTION_REG where USERID=? ");
            stmt.setString(1,userid);
            ResultSet rs=stmt.executeQuery();
            t_previoushistory.setModel(DbUtils.resultSetToTableModel(rs));

        }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
            } finally {
                try {
                    if(con!=null) con.close();
                }
                catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
                }

                try {
                    if(stmt!=null) stmt.close();
                }
                catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
                }
            }
    }

    private void initComponents(String id) {
        //Nimbus begining
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //Nimbus ending
        userid=id;
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_reason = new javax.swing.JTextArea();
        b_submit = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        t_previoushistory = new javax.swing.JTable();
        d_start = new com.toedter.calendar.JDateChooser();
        d_end = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mess Reduction");
        setResizable(false);

        jLabel2.setText("Previous History");

        jLabel3.setText("New Application");

        jLabel4.setText("Starting Date(dd/mm/yyyy)");

        jLabel5.setText("Ending Date(dd/mm/yyyy)");

        jLabel6.setText("Reason");

        ta_reason.setColumns(20);
        ta_reason.setRows(5);
        jScrollPane1.setViewportView(ta_reason);

        b_submit.setText("Submit");
        b_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_submitActionPerformed(evt);
            }
        });

        t_previoushistory.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(t_previoushistory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d_end, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(b_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(d_start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(d_end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addComponent(b_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }

    private void b_submitActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy ");  
            LocalDateTime now = LocalDateTime.now();  
            String today=dtf.format(now); 
            DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");  
            String strtDate = dateFormat.format(d_start.getDate()); 
            String endDate = dateFormat.format(d_end.getDate());
            String details=ta_reason.getText();
            con=new Connector().getCon();
            stmt=con.prepareStatement("INSERT INTO `proj`.`MESS_REDUCTION_REG` (`USERID`, `FROM_DATE`, `TO_DATE`,`DATE_SUBMITTED`,`REASON`, `STATUS`) VALUES (?, ?, ?, ?, ?, ?);");
            stmt.setString(1,userid);
            stmt.setString(2,strtDate);
            stmt.setString(3,endDate);
            stmt.setString(4,today);
            stmt.setString(5,details);
            stmt.setString(6,"Pending");
            int flag = stmt.executeUpdate();
            if(flag==1)
                JOptionPane.showMessageDialog(null,"Request Submitted");
            fetch();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        } finally {
            try {
                if(con!=null) con.close();
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
            }
            
            try {
                if(stmt!=null) stmt.close();
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
            }
        }
    }

    // Begining of variables declaration
    private javax.swing.JButton b_submit;
    private com.toedter.calendar.JDateChooser d_end;
    private com.toedter.calendar.JDateChooser d_start;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable t_previoushistory;
    private javax.swing.JTextArea ta_reason;
    private String userid;
    private Connection con;
    private PreparedStatement stmt;
    // End of variables declaration
}