import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ImageIconTest {
    public static void main(String args[]){
        JFrame  frame = new JFrame("Hello  Swing");
        ImageIcon icon = new ImageIcon("../../Week7/Tuesday/imgs/happy.gif", "Happy");
        JLabel logo = new JLabel(icon);   
        // JLabel logo = new JLabel("test", icon, JLabel.CENTER);        
        frame.add(logo);
        // frame.pack(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}

