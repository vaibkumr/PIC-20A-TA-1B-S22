import javax.swing.*;
public class SwingInheritence extends JFrame { 
    SwingInheritence() {
        super("Discussion");
        JButton b = new JButton("PIC 20A");
        add(b); 
        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SwingInheritence();
    }
}