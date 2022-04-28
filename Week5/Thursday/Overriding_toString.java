import java.lang.reflect.Constructor;

public class Overriding_toString {
    private int data;

    public Overriding_toString(int data){
        this.data = data;
    }

    public static void main(String args[]){
        Overriding_toString obj = new Overriding_toString(10);
        System.out.println(obj);
    }

    public String toString() {
        return "I am an object of class `Overriding_toString` with data: " + this.data;
    } 
    
}
