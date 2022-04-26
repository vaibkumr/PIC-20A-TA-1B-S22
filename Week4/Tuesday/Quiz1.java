package Week4.Tuesday;

public class Quiz1 {
    public static void main(String args[]){
        // q1();
        q2();

    }

    public static void q1(){
        char[] Alphabet = new char[26];
        for( int i = 0; i<26;i++){
            // Alphabet[i] = (char) (65+i); //RIGHT
            // Alphabet[i]= (char) ('A'+i); //RIGHT
            // Alphabet[i] = 65+i; //WRONG
            Alphabet[i] = 65; //RIGHT_1 
            Alphabet[i] += i; //RIGHT_2
            System.out.println(Alphabet[i]);
        }
    }

    public static void q2(){
        Soldier[] sols;                                    //line 1
        sols = new Soldier[10];                            //line 2
        System.out.println(sols);
        for (int i=1; i<10; i++) sols[i] = new Soldier();  //line 3
        sols[0].fire();                                    //line 4
        // int x[];
        // x = new int[10];
        // System.out.println(x);
    }    
}

class Soldier{
    public void fire(){
        System.out.println("fire");
    }
}