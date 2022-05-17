
import javax.swing.*;

public class JOptionPaneTest {
    public static void main(String args[]){
        JFrame  frame = new JFrame("Hello  Swing");
        JOptionPane j = new JOptionPane();
        frame.add(j);
        JOptionPane.showMessageDialog(null, "test");
        frame.pack(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

