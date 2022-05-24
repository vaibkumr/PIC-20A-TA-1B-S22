
import javax.swing.*;

public class JOptionPaneTest {
    public static void main(String args[]){
        JFrame  frame = new JFrame("Hello  Swing");
        JOptionPane j = new JOptionPane();

        frame.add(j);
        JOptionPane.showMessageDialog(null, "test");
        // JOptionPane.showInputDialog(null, "test");
        // JOptionPane.showConfirmDialog(null, "test");

        // Object[] options = { "YES", "YES" };
        // JOptionPane.showOptionDialog(
        //     null, 
        //     "The illusion of choice", 
        //     "Warning",
        //     JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
        //     null, 
        //     options, 
        //     options[0]
        // );

        frame.pack(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

