import java.net.*;
import java.io.*;

public class StreamBytes {
    public static void main(String[] args) throws IOException { //throws IOException is important
        InputStream in = new FileInputStream("f3.txt");
        OutputStream out; 
        out = new FileOutputStream("f2.txt");
        while (true) {
            int nextByte = in.read();
            if (nextByte == -1)
                break;
            out.write((char) nextByte);
        }
        in.close();
        out.close();
    }

//     public static void main(String[] args){ //throws IOException is important
//         try{
//             InputStream in = new FileInputStream("f1.txt");
//             OutputStream out; 
//             out = new FileOutputStream("f2.txt");
//             while (true) {
//                 int nextByte = in.read();
//                 if (nextByte == -1)
//                     break;
//                 out.write((char) nextByte);
//             }
//             in.close();
//             out.close();
//         }
//         catch(Exception e){
//             System.out.print(e);
//         }

//     }    
// }

}