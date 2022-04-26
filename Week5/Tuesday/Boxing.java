
public class Boxing {

    public static void printObj(Object obj){
        System.out.println(obj.getClass());
    }

    public static void printFloat(float d){
        System.out.println(d);
    }    
    public static void main(String[] args){
        int x = 10;
        printFloat(x);
        // printObj(x);
    }
    
}
