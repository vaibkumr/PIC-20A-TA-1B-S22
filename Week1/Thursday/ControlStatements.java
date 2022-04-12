// package Week1.Thursday;

public class ControlStatements {
    
    static void conditionalStatements(){
        //if else
        float score = 92.99f;
        if(score < 10)
            System.out.println("You can do better! Good luck.");
        else if (score < 50) //you can ommit curly brackets for single line statements
            System.out.println("You haveve done pretty good!");
        else{
            System.out.println("Wow you are smart");
        }        
    }

    static void forLoop(int n){
        for(int i=0; i<n; i++){
            System.out.println("For Loop Iteration #: "+i);
        }
    } 
    
    static void whileLoop(int n){
        int i=0;
        while(i<n){
            System.out.println("While Loop Iteration #: "+i);
            i++;
        }

    }     

    static void comparingStrings(){
        String name = new String("Vaibhav Kumar");
        String realName = new String("Vaibhav Kumar");
        if(name==realName)
            System.out.println("operator `==` matched!");
        else
            System.out.println("operator `==` didn't match!");

        if(name.equals(realName))
            System.out.println("function `.equals` matched!");
        else
            System.out.println("function `.equals` didn't match!");           
    }
    
    public static void main(String args[]){
        conditionalStatements();
        forLoop(3);
        whileLoop(3);
        // comparingStrings();
    }
    
}
