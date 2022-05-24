import java.io.*;

public class PrintStreamTest {
    public static void main(String[] args) {

        String data = "Some text 123hkj.123 ak";

        try {
            PrintStream output = new PrintStream("f.txt");
            // PrintStream output = new PrintStream(System.out);
            output.print(data);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
    
}
