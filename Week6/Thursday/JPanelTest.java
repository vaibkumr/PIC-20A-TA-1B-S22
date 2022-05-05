import java.awt.*;
import javax.swing.*;

public class JPanelTest {
    public static void main(String args[]){
        JFrame  frame = new JFrame("Hello  Swing");
        JPanel  panel = new JPanel();
        panel.add(new JButton("Button 1"));
        frame.add(panel);
        frame.setSize(300, 200);        
        frame.setVisible(true);
    }    
    
}
