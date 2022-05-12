package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*
;
public class QuoteOption extends JPanel{
    String comedyQuote,philosopyQuote,carpenterQuote;
    JLabel quote;
    JRadioButton comedy,philosophy,carpenter;
    public QuoteOption(){
        comedyQuote = "Take my wife please";
        philosopyQuote = "I think, therefore I am";
        carpenterQuote = "Measure twice, cut once";

        quote = new JLabel(comedyQuote);
        quote.setFont(new Font("Helvetica", Font.BOLD,24));

        comedy     = new JRadioButton("comedy");
        philosophy = new JRadioButton("philosophy");
        carpenter  = new JRadioButton("carpenter");

        ButtonGroup group = new ButtonGroup();
        group.add(comedy);
        group.add(philosophy);
        group.add(carpenter);

        ActionListener listener = new QuoteListener();
        comedy.addActionListener(listener);
        philosophy.addActionListener(listener);
        carpenter.addActionListener(listener);

        this.add(quote);
        this.add(comedy);
        this.add(philosophy);
        this.add(carpenter);
        setPreferredSize(new Dimension(300,100));
    }

    private class QuoteListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            //Question:
            //=== vs .equals
            //what to use?
            if(source==comedy){
                // source.equals(comedy)
                quote.setText(comedyQuote);
            }
            else if(source==carpenter){
                quote.setText(carpenterQuote);
            }
            else if(source==philosophy){
                quote.setText(philosopyQuote);
            }
        }

    }

    public static void main(String args[]){
        JFrame frame = new JFrame("Quote");
        JPanel panel = new QuoteOption();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
