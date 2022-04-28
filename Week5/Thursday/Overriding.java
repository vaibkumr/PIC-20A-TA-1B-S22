import java.util.concurrent.PriorityBlockingQueue;

public class Overriding {
    public static void main(String args[]){
        Child c = new Child();
        c.print();
        Parent.printStatic();
        // Child.printStatic();
    }
}

class Parent {

    public void print(){
        System.out.println("Hi I am the parent class.");
    }

    public static void printStatic(){
        System.out.println("Hi I am the parent class's static member.");
    }  
    
    final public void printFinal(){
        System.out.println("Hi I am the final boss of overriding.");

    }
}

class Child extends Parent{
    public void print(){
        System.out.println("Hi I am the child class.");
    }

    // public void printStatic(){
    //     System.out.println("Hi I am the child class's static member.");
    // }
    
    // public void printFinal(){
    //     System.out.println("Hi I am the child class trying to overriding a final method.");
    // }    
}
