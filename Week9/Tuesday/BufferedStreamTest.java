import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args) throws IOException { //throws IOException is important
        InputStream in ;
        OutputStream out; 
        in = new FileInputStream("f1.txt");
        in = new BufferedInputStream(in);

        out = new FileOutputStream("f2.txt");
        out = new BufferedOutputStream(out);
        while (true) {
            int nextByte = in.read();
            if (nextByte == -1)
                break;
            out.write((char) nextByte);
        }
        in.close();
        out.close();
    }
}
