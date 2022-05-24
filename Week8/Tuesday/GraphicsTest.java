import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GraphicsTest extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // do your superclass's painting routine first, and then paint on top of it.
        g.setColor(Color.RED);
        // g.fillRect(0, 0, 100, 100);
        g.fillOval(0, 0, 100, 100);
    }

    protected void callRepaint(){
        repaint();
    }

    public static void main(String args[]){
		JFrame frame = new JFrame("Rebound example");
		GraphicsTest g = new GraphicsTest();

		frame.add(g);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);   
		frame.setVisible(true);	       
        
        while(true){
            g.callRepaint();
        }
    }
    
}

