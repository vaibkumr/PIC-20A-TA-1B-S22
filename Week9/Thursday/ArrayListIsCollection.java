import java.util.*;

public class ArrayListIsCollection {
    public static void main(String[] args){
        ArrayList < String > c = new ArrayList <String>();
        c.add("Alice");
        c.add("Bob");
        c.add("Carol");
        System.out.println(c.contains("Eric"));
        c.remove("Carol");
        c.remove("Dave");
        for (String s: c) 
            System.out.println(s);
        
        System.out.println(c); //Array lists are pretty cool to print

        // int[] arr = new int[3];
        // arr[0] = 1;
        // arr[1] = 1;
        // arr[2] = 2;
        // System.out.println(arr);

    }
}
