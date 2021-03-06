package hari;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author hari
 */

public class MessMenuAdmin extends javax.swing.JFrame {

    public MessMenuAdmin() {
        initComponents();   
    }

    private void initComponents() {

        //Nimbus begining
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MessMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MessMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MessMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MessMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //Nimbus Ending
        
        
        b_choosefile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf_selectedfile = new javax.swing.JTextField();
        b_viewmenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mess Menu");

        b_choosefile.setText("Choose File");
        b_choosefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_choosefileActionPerformed(evt);
            }
        });

        jLabel1.setText("To change mess menu, please select the new jpg file of menu");

        tf_selectedfile.setEditable(false);
        tf_selectedfile.setText("No File Chosen");

        b_viewmenu.setText("View Present Menu");
        b_viewmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_viewmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(b_choosefile, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_selectedfile, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(b_viewmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(b_viewmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_choosefile)
                    .addComponent(tf_selectedfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }

    private void b_choosefileActionPerformed(java.awt.event.ActionEvent evt) {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files","jpg");
        JFileChooser file=new JFileChooser();
        JFrame frame=new JFrame();
        file.setMultiSelectionEnabled(true);
        file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        file.setFileFilter(filter);
        file.setFileHidingEnabled(false);
        if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            java.io.File f = file.getSelectedFile();
            tf_selectedfile.setText(file.getSelectedFile().getAbsolutePath());
            File src=new File(f.getPath());
            File dest=new File("./src/projecttemp/messmenu.jpg");
            try {
                if(dest.exists())
                {
                    dest.delete();
                }
                Files.copy(src.toPath(), dest.toPath());                
                JOptionPane.showMessageDialog(frame,"Mess Menu Updated");
            }
            catch(IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(frame,"Error in updation");
            }
        }
        else
        {
             tf_selectedfile.setText("File not chosen");
        }
        
    }

    private void b_viewmenuActionPerformed(java.awt.event.ActionEvent evt) {
        new ViewMessMenu();
    }


    // Variables declaration - do not modify
    private javax.swing.JButton b_choosefile;
    private javax.swing.JButton b_viewmenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tf_selectedfile;
    // End of variables declaration
}