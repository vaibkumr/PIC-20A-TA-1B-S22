public class ArrayException {

    public void f1(){
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);
    }

    public void f2(){
        int[] arr = {1, 2, 3};
        try{
            System.out.println(arr[3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    
    public void f3(){
        int[] arr = {1, 2, 3};
        try{
            System.out.println(arr[3]);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }    

    public static void main(String args[]){
        ArrayException e = new ArrayException();
        e.f3();
        System.out.println("END");

    }
    
}
