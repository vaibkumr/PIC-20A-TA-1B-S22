import java.awt.*;
import javax.swing.*;
import org.w3c.dom.events.Event;
import java.awt.event.*;

public class SimpleMouseListener {

    public class MyMouseListener implements MouseListener{

        public  void  mouseClicked(MouseEvent e) {System.out.println("clicked");}               
        public  void  mouseEntered(MouseEvent e) {System.out.println("entered");}
        public  void  mouseExited(MouseEvent e) {System.out.println("exited");}
        public  void  mousePressed(MouseEvent e) {System.out.println("pressed");}
        public  void  mouseReleased(MouseEvent e) {System.out.println("released");}    

        // public  void  mouseClicked(MouseEvent e) {
        //     System.out.println("X: "+e.getX());
        //     System.out.println("Y: "+e.getX());
        //     System.out.println("Button: "+e.getButton());
        //     //More here: https://docs.oracle.com/javase/7/docs/api/java/awt/event/MouseEvent.html
        // }             
    }

    public void gui(){
        JFrame  frame = new JFrame("Hello  Swing");
        JPanel  panel = new JPanel();
        JButton b = new JButton("Button 1");
        panel.addMouseListener(new MyMouseListener());
        panel.add(b);
        frame.add(panel);
        frame.setSize(300, 200);        
        frame.setVisible(true);        

    }
    public static void main(String args[]){
        SimpleMouseListener e = new SimpleMouseListener();
        e.gui();
    }    
        
    
}
