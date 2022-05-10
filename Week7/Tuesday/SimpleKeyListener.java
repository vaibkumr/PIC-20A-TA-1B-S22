import java.awt.*;
import javax.swing.*;
import org.w3c.dom.events.Event;
import java.awt.event.*;

public class SimpleKeyListener {

    public class MyKeyListener implements KeyListener{

        // public  void  keyPressed(KeyEvent e) {System.out.println("clicked");}        
        public  void  keyReleased(KeyEvent e) {System.out.println("entered");}
        public  void  keyTyped(KeyEvent e) {System.out.println("exited");}

        public void keyPressed(KeyEvent e) {
            System.out.println(e.getKeyCode());
            System.out.println(e.getKeyChar());
            // More here: https://docs.oracle.com/javase/7/docs/api/java/awt/event/KeyEvent.html
        }        
    }

    public void gui(){
        JFrame  frame = new JFrame("Hello  Swing");
        JPanel  panel = new JPanel();
        JButton b = new JButton("Button 1");
        panel.addKeyListener(new MyKeyListener());
        panel.add(b);
        frame.add(panel);
        frame.setSize(300, 200);        
        frame.setVisible(true);      
        panel.setFocusable(true);  //this enables "typing", imagine setting focus on different text fields.

    }
    public static void main(String args[]){
        SimpleKeyListener e = new SimpleKeyListener();
        e.gui();
    }    
        
    
}
