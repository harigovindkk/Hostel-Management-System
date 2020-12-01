package hari;


/**
 *
 * @author hari
 */
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
public class StudentDashboard extends javax.swing.JFrame {


    
    public StudentDashboard(String userid, boolean b) {
        initComponents(userid,b);
        tf_welcomemessage.setText("Welcome "+id+"!");
        fetch();
    }
    public void fetch() {
        try
        {
            con=new Connector().getCon();
            stmt=con.prepareStatement("SELECT MSG_FROM,MESSAGE,TIME_SENT from proj.MESSAGES where MSG_TO=? or MSG_TO=?  order by MESSAGE_ID DESC;");
            stmt.setString(1,id);
            stmt.setString(2,"ALL");
            ResultSet rs=stmt.executeQuery();
            t_messages.setModel(DbUtils.resultSetToTableModel(rs));

        } catch(SQLException e) {
               JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin");
               e.printStackTrace();
        } catch(Exception e) {
               JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin");
        } finally {
            try {
               if(con!=null) con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin");
            }
            try {
               if(stmt!=null) stmt.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin");
            }

        }
    }


    private void initComponents(String userid,boolean b) {
        val=b;
        id=userid;
        con=null;
        stmt=null;
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        b_homegoingoutgoing = new javax.swing.JButton();
        b_complaintregister = new javax.swing.JButton();
        b_suggestions = new javax.swing.JButton();
        b_messbill = new javax.swing.JButton();
        b_messmenu = new javax.swing.JButton();
        b_messreduction = new javax.swing.JButton();
        b_hostelvacateroomchange = new javax.swing.JButton();
        b_studentslookup = new javax.swing.JButton();
        tf_welcomemessage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        b_logout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_messages = new javax.swing.JTable();
        b_myprofile = new javax.swing.JButton();

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
        setTitle("Student Dashboard");

        b_homegoingoutgoing.setText("Homegoing/Outgoing Register");
        b_homegoingoutgoing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_homegoingoutgoingActionPerformed(evt);
            }
        });

        b_complaintregister.setText("Complaint Register");
        b_complaintregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_complaintregisterActionPerformed(evt);
            }
        });

        b_suggestions.setText("Suggestions");
        b_suggestions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_suggestionsActionPerformed(evt);
            }
        });

        b_messbill.setText("Mess Bill");
        b_messbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_messbillActionPerformed(evt);
            }
        });

        b_messmenu.setText("Mess Menu");
        b_messmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_messmenuActionPerformed(evt);
            }
        });

        b_messreduction.setText("Mess Reduction");
        b_messreduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_messreductionActionPerformed(evt);
            }
        });

        b_hostelvacateroomchange.setText("Hostel Vacate/Room Change ");
        b_hostelvacateroomchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_hostelvacateroomchangeActionPerformed(evt);
            }
        });

        b_studentslookup.setText("Students Lookup");
        b_studentslookup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_studentslookupActionPerformed(evt);
            }
        });

        tf_welcomemessage.setText("Welcome User ! ");

        jLabel2.setText("Notifications And Messages");

        jLabel3.setText("Select any one of the below options to continue ");

        b_logout.setText("Logout");
        b_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_logoutActionPerformed(evt);
            }
        });

        t_messages.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(t_messages);

        b_myprofile.setText("My Profile");
        b_myprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_myprofileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b_suggestions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b_complaintregister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b_messmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b_homegoingoutgoing, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b_messbill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b_hostelvacateroomchange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b_studentslookup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b_messreduction, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(91, 91, 91))))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(tf_welcomemessage, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_myprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_welcomemessage, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_myprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_hostelvacateroomchange, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_homegoingoutgoing, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_complaintregister, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_studentslookup, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_suggestions, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_messreduction, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_messbill, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_messmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }

    private void b_homegoingoutgoingActionPerformed(java.awt.event.ActionEvent evt) {    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_OutgoingRegister(id).setVisible(true);
            }
        });      
    }

    private void b_complaintregisterActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComplaintRegister(id).setVisible(true);
            }
        });
    }

    private void b_suggestionsActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suggestions(id).setVisible(true);
            }
        });      
    }

    private void b_messmenuActionPerformed(java.awt.event.ActionEvent evt) {
        if(val==false)
        {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMessMenu();
            }
        }); 
            
        }
        else
        {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MessMenuAdmin().setVisible(true);
            }
        });
        }
    }

    private void b_hostelvacateroomchangeActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VacateChange(id).setVisible(true);
            }
        });      
    }

    private void b_studentslookupActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsLookup().setVisible(true);
            }
        });
    }

    private void b_messreductionActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MessReduction(id).setVisible(true);
            }
        });
    }

    private void b_messbillActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMessBill(id).setVisible(true);
            }
        });
    }

    private void b_logoutActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Logged out Succesfully");
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }
    
    private void b_myprofileActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyProfile(id).setVisible(true);
            }
        });
        
    }


    // Variables declaration - do not modify
    private javax.swing.JButton b_complaintregister;
    private javax.swing.JButton b_homegoingoutgoing;
    private javax.swing.JButton b_hostelvacateroomchange;
    private javax.swing.JButton b_logout;
    private javax.swing.JButton b_messbill;
    private javax.swing.JButton b_messmenu;
    private javax.swing.JButton b_messreduction;
    private javax.swing.JButton b_myprofile;
    private javax.swing.JButton b_studentslookup;
    private javax.swing.JButton b_suggestions;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable t_messages;
    private javax.swing.JLabel tf_welcomemessage;
    private Connection con;
    private PreparedStatement stmt;
    private String id;
    private boolean val;
    // End of variables declaration
}