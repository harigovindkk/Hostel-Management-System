/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmsadmin;

import java.awt.BorderLayout;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author hari
 */
public class ViewMessMenu {

    public ViewMessMenu(){
                SwingUtilities.invokeLater(new Runnable() {
                            public void run()
                                    {
                                        JFrame frame=new JFrame("Mess Menu");
                                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                        BufferedImage img=null;
                                        try
                                        {
                                            img=ImageIO.read(getClass().getResource("./messmenu.jpg"));
                                        }
                                        catch(IOException e)
                                        {
                                            e.printStackTrace();
                                            System.exit(1);
                                        }
                                        ImageIcon imgicon=new ImageIcon(img);
                                        JLabel lbl=new JLabel();
                                        lbl.setIcon(imgicon);
                                        frame.getContentPane().add(lbl, BorderLayout.CENTER);
                                        frame.pack();
                                        frame.setLocationRelativeTo(null);
                                        frame.setVisible(true);
                                    }
                        });
            }
    /**
     * @param args the command line arguments
     */
    
}
