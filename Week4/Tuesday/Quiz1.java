package Week4.Tuesday;

public class Quiz1 {
    public static void main(String args[]){

        char[] Alphabet = new char[26];
        for( int i = 0; i<26;i++){
            // Alphabet[i] = (char) (65+i); //RIGHT
            // Alphabet[i]= (char) ('A'+i); //RIGHT
            // Alphabet[i] = 65+i; //WRONG
            // Alphabet[i] = 65; //RIGHT_1
            // Alphabet[i] += i; //RIGHT_2
            System.out.println(Alphabet[i]);
        }
    }
}
