import java.util.*;


public class GenericCollection {

    static public void print(ArrayList <?> x){
        for(Object e:x)
            System.out.println(e);
    }  
    
    static public void printOnlyNumber(ArrayList <? extends Number> x){
        for(Object e:x)
            System.out.println(e);
    }      
    public static void main(String[] args){

        ArrayList <Integer> a1 = new ArrayList <Integer>();
        a1.add(1);
        a1.add(2);

        ArrayList <Float> a2 = new ArrayList <Float>();
        a2.add(1.1f);
        a2.add(2.1f);
        
        ArrayList <String> a3 = new ArrayList <String>();
        a3.add("one");
        a3.add("two"); 
        
        print(a1);
        print(a2);
        print(a3);

        printOnlyNumber(a1);
        

    }


}
