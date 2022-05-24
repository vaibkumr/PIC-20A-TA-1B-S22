import java.io.*;

public class TestFileRead {

  public void readSafe() {
    try
    {
      FileInputStream in = new FileInputStream("file2.txt");
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found.");
      return;
    }
    System.out.println("File found.");
  }  

  public static void main(String[] args) {
      TestFileRead t = new TestFileRead();
      t.readSafe(); 
  }
}