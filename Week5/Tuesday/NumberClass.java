public class NumberClass {

    public static void printObj(Number obj){
        System.out.println(obj.getClass());
        System.out.println(obj.doubleValue());
        System.out.println(obj.floatValue());
        System.out.println(obj.intValue());
        System.out.println(obj.longValue());
        System.out.println(obj.byteValue());
        System.out.println(obj.shortValue());
    }

    public static void main(String args[]){
        int x = 10;
        printObj(x);
        
    }
    
}
