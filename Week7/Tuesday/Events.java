import java.awt.*;
import javax.swing.*;
import org.w3c.dom.events.Event;
import java.awt.event.*;  

public class Events {

    public class SimpleListener implements ActionListener{
        public  void  actionPerformed(ActionEvent e) {
            System.out.println("Button1  clicked");
        }        
    }

    public void gui(){
        JFrame  frame = new JFrame("Hello  Swing");
        JPanel  panel = new JPanel();
        JButton b = new JButton("Button 1");
        b.addActionListener(new SimpleListener());
        panel.add(b);
        frame.add(panel);
        frame.setSize(300, 200);        
        frame.setVisible(true);        

    }
    public static void main(String args[]){
        Events e = new Events();
        e.gui();
    }    
    
}
