import java.io.*;

public class FinallyBlock {
    public static void main(String args[]){
        String file = "file2.txt";

        FileReader fr = null;
        try {
            fr = new FileReader(file);
            System.out.println("File found.");
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
            return;
        } 
        finally {
            System.out.println("Finally will always run!");
        }
    }
    
}

