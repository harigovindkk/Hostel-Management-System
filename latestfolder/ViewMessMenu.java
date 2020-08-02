/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.awt.BorderLayout;
import javax.swing.SwingUtilities;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author hari
 */
public class ViewMessMenu extends javax.swing.JFrame{

    public ViewMessMenu(){
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                setTitle("Mess Menu");
                setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
                BufferedImage img=null;
                try
                {
                    img=ImageIO.read(getClass().getResource("./messmenu.jpg"));
                } catch(IOException e) {
                    JOptionPane.showMessageDialog(null,"Can not locate messmenu. Contact System Admin.");
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
                }
                ImageIcon imgicon=new ImageIcon(img);
                javax.swing.JLabel lbl=new JLabel();
                lbl.setIcon(imgicon);
                getContentPane().add(lbl, BorderLayout.CENTER);
                pack();
                setLocationRelativeTo(null);
                setVisible(true);
            }
        });
    }
    /**
     * @param args the command line arguments
     */
    
}
