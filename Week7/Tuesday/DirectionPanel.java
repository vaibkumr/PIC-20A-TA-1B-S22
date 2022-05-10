package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DirectionPanel extends JPanel{
    private final int WIDTH=300,HEIGHT=300;
    private final int JUMP=10;
    private final int IMAGE_SIZE=30;
    private ImageIcon up, down, left, right, currentImage;
    private int x,y;

    public ImageIcon resize(ImageIcon imgIcon){
        Image image = imgIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        return new ImageIcon(newimg);  // transform it back
    }

    public DirectionPanel(){
        addKeyListener(new DirectionListener());
        x = WIDTH/2;
        y = HEIGHT/2;
        up   = new ImageIcon("imgs/up.png");
        down   = new ImageIcon("imgs/down.png");
        left   = new ImageIcon("imgs/left.png");
        right   = new ImageIcon("imgs/right.png");

        up = resize(up);
        down = resize(down);
        left = resize(left);
        right = resize(right);

        currentImage = right;
        setBackground(Color.white);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        //For a key press to affect a component, 
        //the component must have the keyboard focus
        setFocusable(true);
    }

    // this function will be called when repaint(0 is called)
    @Override
    public void paintComponent(Graphics page){
        // paint a JPanel
        super.paintComponent(page);
        // customized painting
        currentImage.paintIcon(this,page,x,y); //repaint the icon at `x` and `y`.
    }

    private class DirectionListener implements KeyListener{        
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()){
                case KeyEvent.VK_UP:
                    currentImage = up;
                    y-=JUMP;
                    break;
                case KeyEvent.VK_DOWN:
                    currentImage = down;
                    y+=JUMP;
                    break;
                case KeyEvent.VK_LEFT:
                    currentImage = left;
                    x-=JUMP;
                    break;                    
                case KeyEvent.VK_RIGHT:
                    currentImage = right;
                    x+=JUMP;
                    break;
            }
            //update Jpanel
            repaint();
        }
        @Override
        public void keyTyped(KeyEvent e) { }
        @Override
        public void keyReleased(KeyEvent e) { }
    } 

    public static void main(String args[]){
        /*
        System.out.println("pokemon " + (3 +1));
        System.out.println( (int) (Math.random()*6) );
        Integer nums[] = {Integer.valueOf(10), Integer.valueOf(14)};
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        */
        
        JFrame frame = new JFrame("Direction Arrow");
        JPanel panel = new DirectionPanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //what happens when you click the close button?
        
        
    }
}
