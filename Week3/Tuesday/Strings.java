import java.io.Console;
import java.util.concurrent.Flow.Subscriber;

public class Strings {


    public static void main(String[] args){
        String name = "Vaibhav";
        // System.out.println(name);


        // name.concat(" Kumar");
        System.out.println(name);

        // String fullName = name.concat(" Kumar");
        // System.out.println(fullName);        

        // name += " Kumar";
        // System.out.println(name);        

        // System.out.println(name.charAt(2));
        // name.charAt(2) = 'x';

        Student s1 = new Student("Jake");
        System.out.println(s1);

        // Student s2 = new Student("Emily");
        // System.out.println(s2);        
    }
    
}


class Student{
    String name;

    public String toString(){
        return "Hey! I am " + name;
    }

    Student (String _name){
        name = _name;
    }
}