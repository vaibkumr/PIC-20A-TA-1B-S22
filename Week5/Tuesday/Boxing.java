
public class Boxing {

    public static void printObj(Object obj){
        System.out.println(obj.getClass());
    }

    public static void printFloat(float d){
        System.out.println(d);
    }    
    public static void main(String[] args){
        boolean x = true;
        // printFloat(x);
        printObj(x);
    }
    
}
