import javax.swing.*;
import java.awt.*;

public class JFrameTest {
    public static void main(String args[]){
        JFrame  frame = new JFrame("Hello  Swing");
        // Container contPane = frame.getContentPane();
        // contPane.add(new  JLabel("Hello  World"));
        frame.add(new  JLabel("Hello  World"));
        frame.setVisible(true);
    }
}
