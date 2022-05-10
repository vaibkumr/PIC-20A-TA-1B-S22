import java.awt.event.*;
import javax.swing.*;

public class TimerTest {

   
    public static void main(String [] args) throws Exception{

        ActionListener printSomething = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.out.println("something...");
            }
        }; 

        Timer timer = new Timer(100, printSomething);
        timer.start();
        Thread.sleep(5000); //stop the execution of current thread and let the timer thread run.
    }
    
}
