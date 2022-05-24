public class ThrowException {

    public int divide(int a, int b){
        int c = a/b;
        return c;
    }

    public int divideSafe(int a, int b){
        if(b==0){
            throw new IllegalArgumentException();
        }
        return a/b;
    }    

    public static void main(String args[]){
        ThrowException t = new ThrowException();
        // t.divide(1, 0);
        // t.divideSafe(1, 0);

        try{
            t.divideSafe(1, 0);
        }
        catch (Exception e){
            System.out.println("Can't divide.");
        }
    }
    
}
