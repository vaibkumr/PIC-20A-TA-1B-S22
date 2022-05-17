package GUI;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


import java.awt.*;
import java.awt.event.*;

public class SlideColorPanel extends JPanel{
    JSlider rslider, gslider, bslider;
    JLabel rLabel, gLabel, bLabel;
    JPanel controls, colorPanel;

    public SlideColorPanel(){
        rslider = new JSlider(JSlider.HORIZONTAL,0,255,200);
        rslider.setMajorTickSpacing(50);
        rslider.setMinorTickSpacing(10);
        rslider.setPaintTicks(true);
        rslider.setPaintLabels(true);
        rslider.setAlignmentX(Component.LEFT_ALIGNMENT);

        gslider = new JSlider(JSlider.HORIZONTAL,0,255,0);
        gslider.setMajorTickSpacing(50);
        gslider.setMinorTickSpacing(10);
        gslider.setPaintTicks(true);
        gslider.setPaintLabels(true);
        gslider.setAlignmentX(Component.LEFT_ALIGNMENT);

        bslider = new JSlider(JSlider.HORIZONTAL,0,255,0);
        bslider.setMajorTickSpacing(50);
        bslider.setMinorTickSpacing(10);
        bslider.setPaintTicks(true);
        bslider.setPaintLabels(true);
        bslider.setAlignmentX(Component.LEFT_ALIGNMENT);

        SliderListener listener = new SliderListener();
        rslider.addChangeListener(listener);
        gslider.addChangeListener(listener);
        bslider.addChangeListener(listener);

        rLabel = new JLabel("Red: 0");
        rLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        gLabel = new JLabel("Green: 0");
        gLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        bLabel = new JLabel("Blue: 0");
        bLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        controls = new JPanel();
        BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
        controls.setLayout(layout);
        controls.add(rLabel);
        controls.add(rslider);
        controls.add(Box.createRigidArea(new Dimension(0,20)));
        controls.add(gLabel);
        controls.add(gslider);
        controls.add(Box.createRigidArea(new Dimension(0,20)));
        controls.add(bLabel);
        controls.add(bslider);        
        controls.add(Box.createRigidArea(new Dimension(0,20)));

        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(100,100));
        colorPanel.setBackground(new Color(rslider.getValue(),0,0));

        add(controls);
        add(colorPanel);
    }

    private class SliderListener implements ChangeListener{
        private int red,green,blue;
        @Override
        public void stateChanged(ChangeEvent e) {
            red   = rslider.getValue();
            green = gslider.getValue();
            blue  = bslider.getValue();
            rLabel.setText("Red: " + red);
            gLabel.setText("Green: " + green);
            bLabel.setText("Blue: " + blue);
            colorPanel.setBackground(new Color(red,green,blue));
        }        
    }

    public static void main(String args[]){
        JFrame frame = new JFrame("Slide Color");
        JPanel panel = new SlideColorPanel();
        frame.add(panel);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    } 
}
