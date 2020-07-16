package hari;


/**
 *
 * @author rr1
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class RegistrationWindow extends javax.swing.JFrame {

    private static int flag=1;
    public RegistrationWindow(Boolean a) {
        this();
        this.tableNameToAdmin(a);
        
    }
    public void tableNameToAdmin(boolean b) {
        tablecheck=b;
        if(tablecheck) //if admin registration then sets register as  admin
            l_registerasa.setText("Admin");

    }
    public RegistrationWindow() {
       initComponents();
       
   }

    private void initComponents() {
        
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
            java.util.logging.Logger.getLogger(RegistrationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        setResizable(false);
        con=null;
        stmt=null;
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_fullname = new javax.swing.JTextField();
        tf_collegeregno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ff_phonenumber = new javax.swing.JFormattedTextField();
        tf_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pf_password = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        pf_reenterpassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        l_registerasa = new javax.swing.JLabel("Student");
        b_validateandsubmit = new javax.swing.JButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration Window ");

        jLabel2.setText("Full Name");

        jLabel3.setText("College Reg. No");



        tf_collegeregno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_collegeregnoKeyPressed(evt);
            }
            
        });
        
        tf_fullname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_fullnameKeyPressed(evt);
            }
            
        });

        jLabel4.setText("Phone Number");

        jLabel5.setText("E-mail");

        ff_phonenumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ff_phonenumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ff_phonenumberKeyPressed(evt);
            }
        });

        jLabel6.setText("Password");


        jLabel7.setText("Re-Enter Password");

        jLabel8.setText("Register as a");

        b_validateandsubmit.setText("Validate and Submit");
        b_validateandsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               b_validateandsubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_fullname)
                            .addComponent(tf_collegeregno)
                            .addComponent(ff_phonenumber)
                            .addComponent(tf_email)
                            .addComponent(pf_password)
                            .addComponent(pf_reenterpassword)
                            .addComponent(l_registerasa, 0, 113, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(b_validateandsubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_collegeregno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ff_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(pf_reenterpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(l_registerasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(b_validateandsubmit)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }
    

    private void b_validateandsubmitActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {
                fullname=tf_fullname.getText();
                collegeregno=tf_collegeregno.getText();
                phonenumber=ff_phonenumber.getText();
                email=tf_email.getText();
                password=new String(pf_password.getPassword());
                reenterpassword=new String(pf_reenterpassword.getPassword());
                if (fullname.equals("")||collegeregno.equals("")||password.equals("")) {
                    System.out.println("Re-enter");
                } else {
                    if (password.equals(reenterpassword)) {
                        con=new Connector().getCon();                    
                        if(tablecheck)
                            stmt=con.prepareStatement("INSERT INTO `proj`.`ADMIN` (`NAME`, `REG_NO`, `PHONE_NUMBER`, `EMAIL`, `PASSWORD`) VALUES (?, ?, ?, ?, ?);");
                        else {
                            stmt=con.prepareStatement("INSERT INTO `proj`.`STUDENTLIST` (`NAME`, `REG_NO`, `PHONE_NUMBER`, `EMAIL`, `PASSWORD`,`ROOM_NO`) VALUES (?, ?, ?, ?, ?, ?);");
                            stmt.setString(6,"");
                        }
                        stmt.setString(1,fullname);
                        stmt.setString(2,collegeregno);
                        stmt.setString(3,phonenumber);
                        stmt.setString(4,email);
                        stmt.setString(5,HashingPassword.generateHash(password));
                        
                        int flag = stmt.executeUpdate();
                        if(flag==1)
                        {
                                JOptionPane.showMessageDialog(null,"Registration Succesful");
                                tf_fullname.setText("");
                                tf_collegeregno.setText("");
                                ff_phonenumber.setText("");
                                tf_email.setText("");
                                pf_password.setText("");
                                pf_reenterpassword.setText("");
                        }
                        stmt.close();
                        con.close();
                    } else 
                        JOptionPane.showMessageDialog(null,"Password dont match");
                    
                }
        } catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Class Error. Contact System Admin");
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


    private void tf_collegeregnoKeyPressed(java.awt.event.KeyEvent evt) {
        char c=evt.getKeyChar();
        if(Character.isLetter(c))
            tf_collegeregno.setEditable(false);
        else
            tf_collegeregno.setEditable(true);
    }
    
    private void tf_fullnameKeyPressed(java.awt.event.KeyEvent evt) {
        char c=evt.getKeyChar();
        if(Character.isLetter(c))
            tf_fullname.setEditable(true);
        else
            tf_fullname.setEditable(false);
    }

    private void ff_phonenumberKeyPressed(java.awt.event.KeyEvent evt) {
        char c=evt.getKeyChar();
        if(Character.isLetter(c))
            ff_phonenumber.setEditable(false);
        else
            ff_phonenumber.setEditable(true); 
    }



    // Variables declaration 
    private javax.swing.JButton b_validateandsubmit;
    private javax.swing.JLabel l_registerasa;
    private javax.swing.JFormattedTextField ff_phonenumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JPasswordField pf_reenterpassword;
    private javax.swing.JTextField tf_collegeregno;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_fullname;
    private String fullname;     
    private String collegeregno;     
    private String phonenumber;     
    private String email;     
    private String password;     
    private String reenterpassword;
    private Connection con;
    private PreparedStatement stmt;
    private boolean tablecheck;
    
    // End of variables declaration
}
