import java.util.Scanner;
import java.io.*;

public class ScannerTest {
    public void s1(){
        Scanner s = new Scanner(System.in);
        // System.out.println(s.nextInt());
        // System.out.println(s.nextInt());
        System.out.println(s.nextDouble());
        // System.out.println(s.next());
        s.close();        
    }

    public void s2(){
        Scanner s = new Scanner(System.in);
        System.out.println(s.nextInt(16));
        System.out.println(s.nextInt(16));
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();        
    }    

    public void s3(){
        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        s.close();        

    }
    public static void main(String[] args){
        ScannerTest st = new ScannerTest();
        st.s2();
    }
    
}


