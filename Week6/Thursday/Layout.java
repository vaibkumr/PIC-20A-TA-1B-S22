import java.awt.*;
import javax.swing.*;

public class Layout {
    public static void main(String args[]){
        JFrame  frame = new JFrame("Hello  Swing");

        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel1.setBackground(Color.BLUE);
        panel2.setBackground(Color.WHITE);
        panel3.setBackground(Color.RED);

        container.add(panel1);
        container.add(panel2);
        container.add(panel3);

        frame.add(container);
        frame.setSize(300, 200);
        frame.setVisible(true);        
    }
    
}
