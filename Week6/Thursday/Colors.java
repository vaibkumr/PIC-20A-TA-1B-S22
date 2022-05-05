import java.awt.*;
import javax.swing.*;

public class Colors {
    public static void main(String args[]){
        JFrame  frame = new JFrame("Hello  Swing");
        JPanel  panel = new JPanel();
        panel.setBackground(new Color(255,255,255 ));        
        // panel.setBackground(Color.BLUE);        
        frame.add(panel);
        frame.setSize(300, 200);        
        frame.setVisible(true);
    }    
    
}
