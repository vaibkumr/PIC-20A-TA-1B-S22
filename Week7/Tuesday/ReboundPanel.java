import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReboundPanel extends JPanel {
	private final int WIDTH = 500, HEIGHT = 300;
	private final int DELAY = 20, IMAGE_SIZE = 35;
	
	private ImageIcon image;
	private Timer timer;
	private int x, y, moveX, moveY;
	private int ClickCount = 0;
	
	public ReboundPanel() {
		timer = new Timer( DELAY, new ReboundListener() );
		//image = new ImageIcon( getClass().getResource( "images\\happyFace2.gif" ) );
		image = new ImageIcon("imgs/happy.gif");

		this.addMouseListener(new MyMouseEvent());
		addKeyListener(new MyKeyListener());
		
		x = 20; y = 40;
		moveX = moveY = 3;
		
		setPreferredSize( new Dimension(WIDTH, HEIGHT) );
		setBackground( Color.blue );
		setFocusable(true);
		timer.start();
	}
	@Override
	protected void paintComponent ( Graphics page ) {
		super.paintComponent(page);
		image.paintIcon( this,  page,  x,  y);
	}

	private class ReboundListener implements ActionListener{
		public void actionPerformed (ActionEvent event) {
			x+=moveX;
			y+=moveY;
			if ( x<= 0 || x >= WIDTH-IMAGE_SIZE)  moveX = -moveX;
			if ( y<= 0 || y >= HEIGHT-IMAGE_SIZE) moveY = -moveY;
			repaint();
		}
	}

	private class MyKeyListener implements KeyListener{
		@Override
		public void keyPressed(KeyEvent e){
			
			if(e.getKeyCode() == KeyEvent.VK_SPACE){
				JOptionPane.showMessageDialog(null , "Pause, continue?" );
			}
			
		}
		@Override
		public void keyTyped(KeyEvent e){}
		@Override
		public void keyReleased(KeyEvent e){}
	}
	
	private class MyMouseEvent implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			ClickCount++;
			if (ClickCount%2==1) 	timer.stop();
			else					timer.restart();
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {}
		@Override
		public void mouseExited(MouseEvent arg0) {}
		@Override
		public void mousePressed(MouseEvent arg0) {}
		@Override
		public void mouseReleased(MouseEvent arg0) {	}		
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Rebound example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ReboundPanel panel = new ReboundPanel();
		frame.getContentPane().add(panel);
		
		//frame.setSize(500,300); //this include the title bar, boundary
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);		
	}
}

