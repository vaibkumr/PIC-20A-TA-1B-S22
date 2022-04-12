import java.io.*;  
public class Evilify  {  
    public static void main(String args[]){  
        try{  
            String source = "Indentation.java";
            String target = "Indentation_evil.java";
            File file = new File(source);    //creates a new file instance  
            FileReader fr=new FileReader(file);   //reads the file  
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
            String contents = ""; //contains the final code without newlines
            String line;  
            while((line=br.readLine())!=null){  
                contents += line;  
                // contents += "\n"; //uncomment this line to cure evil!   
            }  
            fr.close();    //closes the stream and release the resources  

            File targetFile = new File(target);    //creates a new file instance  
            PrintWriter targetFileWriter = new PrintWriter(targetFile); //creates a file writer
            contents = "//Beware! This is the evil version of "+source+"!\n"+contents;
            targetFileWriter.println(contents);
            targetFileWriter.close();
        }  
        catch(IOException e){  
            e.printStackTrace();  
        }  

    }  
}  