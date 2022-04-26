public class NestedClasses{
    private int data;

    public NestedClasses(int data){
        System.out.println("Outer class instantiated with data: "+data);
        this.data = data;
    }

    public class InnerClass {
        public InnerClass () {
            System.out.println("Inner class has data field: "+data);
        }
    }    
    public static void main(String args[]){
        NestedClasses outerObj = new NestedClasses(10);
        NestedClasses.InnerClass innerObj = outerObj.new InnerClass(); 
        
    }

}