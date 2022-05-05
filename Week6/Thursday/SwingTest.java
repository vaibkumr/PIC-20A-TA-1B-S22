import javax.swing.*;
public class SwingTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Discussion");
        JButton b = new JButton("PIC20A");//creating instance of JButton  
        frame.add(b);//adding button in JFrame  
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}