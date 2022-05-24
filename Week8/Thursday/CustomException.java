public class CustomException {
    
    public void check(String color){
        if(color == "red"){
            throw new RedException("this color not allowed", color);
        }
        else{
            System.out.println(color);
        }
    }
    public static void main(String args[]){
        CustomException c = new CustomException();
        String color = "red";
        c.check(color);
        // try{
        //     c.check(color);
        // }
        // catch (Exception e){
        //     System.out.println("Invalid Color");
        // }


    }
    
}

class RedException extends RuntimeException { 
    public RedException(String errorMessage) {
        super(errorMessage);
    }
}

// class RedException extends Exception { 
//     public RedException(String errorMessage) {
//         super(errorMessage);
//     }
// }