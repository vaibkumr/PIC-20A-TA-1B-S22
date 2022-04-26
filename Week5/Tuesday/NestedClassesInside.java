public class NestedClassesInside{
    private int data;
    private NestedClassesInside.InnerClass innerObj;

    public NestedClassesInside(int data){
        System.out.println("Outer class instantiated with data: "+data);
        this.data = data;
        innerObj = this.new InnerClass();
        //what if I change the order of the above two lines?
    }

    public void print(){
        System.out.println("Outer class data: "+data);
    }

    public class InnerClass {

        public InnerClass () {
            System.out.println("Inner class has data field: "+data);
        }

        public void print(){
            System.out.println("Outer class data: "+data);
        }        
    }    
    public static void main(String args[]){
        NestedClassesInside outerObj = new NestedClassesInside(10);
    }

}