
public class StaticVsNonStaticClass {
    public static void main(String args[]){
        JustPrint.greetings();
        JustPrint.question();
        JustPrint.goodbye();

        Chat c1 = new Chat("PIC 20A");
        c1.greetings();
        c1.question();
        c1.goodbye();   
        
        Chat c2 = new Chat("Student");
        c2.greetings();
        c2.question();
        c2.goodbye();           
    }
}

class JustPrint{
    public static void greetings(){
        System.out.println("Hey!");
    }

    public static void question(){
        System.out.println("What are you doing?");
    }   
    
    public static void goodbye(){
        System.out.println("Have a good day!");
    }       
}

class Chat{
    String user;
    public Chat(String _user){
        user = _user;        
    }

    public void greetings(){
        System.out.println("Hey!, "+user);
    }

    public void question(){
        System.out.println("What are you doing?, "+user);
    }   
    
    public void goodbye(){
        System.out.println("Have a good day!, "+user);
    } 

}