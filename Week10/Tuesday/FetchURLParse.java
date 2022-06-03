import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;


public class FetchURLHW {
    public static void main(String[] args){
        int year = 2014;
        String website = "https://www.math.ucla.edu/~minhrose/baby_name_" + year + ".txt";
        InputStream in = null;
        try {
            URL url = new URL(website); //Create url
            in = url.openStream(); //Open url to extract data from the website
            Reader r = new InputStreamReader(in); //Create InputStreamReader that reads url
            BufferedReader br = new BufferedReader(r); //Create BufferedReader to read efficiently
            String line = br.readLine(); //Read first line of url

            String[] strArray = line.split("\t");

            // String rank = strArray[0];
            // String maleName = strArray[1];
            // String maleCount = strArray[2];
            // String femaleName = strArray[3];
            // String femaleCount = strArray[4]; 


            int rank = Integer.parseInt(strArray[0]);
            String maleName = strArray[1];
            int maleCount = stringToInt(strArray[2]);
            String femaleName = strArray[3];
            int femaleCount = stringToInt(strArray[4]);  
            
            System.out.println(rank);
            System.out.println(maleName);
            System.out.println(maleCount);
            System.out.println(femaleName);
            System.out.println(femaleCount);


            System.out.println(line);
            while (line != null){ //Keep reading until we get to the end of the url
                line = br.readLine(); //Read the next line to continue the loop
            }
        } catch (IOException e) { //Catch IOException if there was a problem opening the url
            System.out.println(e); //Print out IOException to the console
        }  
        
        
    }

    private static int stringToInt(String s) {
        String newS = "";
        for(char c:s.toCharArray()){
            if(c!=',')
                newS = newS+c;
        }
        return Integer.parseInt(newS);
    }    

    
}
