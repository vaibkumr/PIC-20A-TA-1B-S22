// Constructor is internally a nonstatic method with
// name <init> and void return type. It does not return anything. 
//Internally first object is allocated and then its constructor
// is called. Object is not allocated with constructor itself.

public class Constructors {
    int trackId;
    String trackName;

    public Constructors(int _trackId){
        trackId = _trackId;
    }

    public Constructors(String _trackName){
        trackName = _trackName;
    }    

    public void print(){
        System.out.println(trackName);
        System.out.println(trackId);
    }
    public static void main(String[] args){
        // // Constructor overloading
        // Constructors m1 = new Constructors(10);
        // Constructors m2 = new Constructors("Numb");
        // m1.print();
        // m2.print();

        // // // Copy Constructor
        // Polygon p1 = new Polygon(10);
        // p1.print();
        // System.out.println(p1);

        // Polygon p2 = new Polygon(p1);
        // p2.print();
        // System.out.println(p2);

        // // Private Constructor for static methods only
        int x = Math.add(1, 2);
        System.out.println(x);
    }
    
}

class Polygon{
    int nSides;

    public Polygon(int _nSides){
        nSides = _nSides;
    }

    public Polygon(Polygon p){
        nSides = p.nSides;
    }    

    public void print(){
        System.out.println("Polygon #Sides: "+nSides);
    }
}

class Math{
    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }
    
}