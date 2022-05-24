import java.awt.*;
import javax.swing.*;

public class LayoutBoxed {
    public static void main(String args[]){
        JFrame  frame = new JFrame("Components.");
        JPanel  panel = new JPanel();


        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        //Buttons 
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JRadioButton("A Radio Button"));

        // Radio buttons
        JRadioButton  b1 = new  JRadioButton("Comedy");
        JRadioButton  b2 = new  JRadioButton("Philosophy");
        JRadioButton  b3 = new  JRadioButton("Carpenter");
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);

        //Checkboxes
        panel.add(new JCheckBox("Check me out!"));
        panel.add(new JCheckBox("Check me out too!"));

        //Sliders
        panel.add(new JSlider(JSlider.HORIZONTAL ,0 ,255 ,0));

        //Custom Sliders
        JSlider rslider = new JSlider(JSlider.HORIZONTAL ,0 ,255 ,0);
        rslider.setMajorTickSpacing(50);
        rslider.setMinorTickSpacing(10);
        rslider.setPaintTicks(true);
        rslider.setPaintLabels(true);
        rslider.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(rslider);        

        //Text Area
        JTextArea  textArea = new JTextArea("This is a text area!");
        textArea.setBackground(Color.YELLOW);
        panel.add(textArea);

        frame.add(panel);
        frame.setSize(400, 400);        
        frame.setVisible(true);
    }    
    
}
