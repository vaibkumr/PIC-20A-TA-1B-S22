import java.lang.reflect.Constructor;

public class Inheritance {
    public static void main(String args[]){
        Child c = new Child(1, 2, 3);
        c.test();
        System.out.println(c);
    }
}

class Parent {
    private int parentPrivateData;
    public int parentPublicData;
    protected int parentProtectedData;

    public Parent(int a, int b, int c){
        parentPrivateData = a;
        parentPublicData = b;
        parentProtectedData = c;
    }
}

class Child extends Parent{
    public Child(int a, int b, int c){
        super(a, b, c); //Constructor chaining
    }

    public void test(){
        System.out.println(parentPublicData);
        // System.out.println(parentPrivateData);
        System.out.println(parentProtectedData);
    }

    public String toString() {
        return "I am a child of class Parent with public value: "+parentPublicData;
    }    


}
