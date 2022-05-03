import java.lang.reflect.Constructor;

public class Overriding_equals {
    private int data;

    public Overriding_equals(int data){
        this.data = data;
    }

    public static void main(String args[]){
        Overriding_equals obj1 = new Overriding_equals(10);
        // Overriding_equals obj2 = new Overriding_equals(10);
        int obj2 = 10;
        System.out.println(obj1.equals(obj2));
    }

    // public String toString() {
    //     return "I am an object of class `Overriding_equals` with data: " + this.data;
    // } 

    public boolean equals(Overriding_equals obj) {
        if(obj == null)
            return false;
        if(!(obj instanceof Overriding_equals))
            return false;
        if(obj.data == this.data)
            return true;
        return false;
    }    
    
}
