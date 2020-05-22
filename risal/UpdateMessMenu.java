/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hari;

import java.awt.BorderLayout;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.io.File;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.io.FilenameUtils;
/**
 *
 * @author hari
 */

public class UpdateMessMenu {

    public static void main(String args[]) {
        /*
        
        */
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files","jpg","png","jpeg");
        JFileChooser file=new JFileChooser();
        JFrame frame=new JFrame();
        file.setMultiSelectionEnabled(true);
        file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        file.setFileFilter(filter);
        file.setFileHidingEnabled(false);
        if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            java.io.File f = file.getSelectedFile();
            File src=new File(f.getPath());
            String ext=FilenameUtils.getExtension(f.getPath());
            File dest=new File("./src/hari/messmenu."+ext);
            try {
                Files.copy(src.toPath(), dest.toPath());                
                JOptionPane.showMessageDialog(frame,"Mess Menu Updated");
            }
            catch(IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(frame,"Error in updation");
            }
            //System.err.println(f.getPath());
      }
        
    }
    
}