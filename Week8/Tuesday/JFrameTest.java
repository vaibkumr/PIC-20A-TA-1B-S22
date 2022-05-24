import javax.swing.*;

public class JFrameTest {
    public static void main(String args[]){
        JFrame  frame = new JFrame("Hello  Swing");
        // Container contPane = frame.getContentPane();
        frame.add(new JLabel("Hello  World"));
        // frame.setSize(300, 200);   
        frame.pack(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // contPane.add(new  JLabel("Hello  World"));
        frame.setVisible(true);
    }
}
