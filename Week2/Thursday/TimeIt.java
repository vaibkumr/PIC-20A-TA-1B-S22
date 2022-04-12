public class TimeIt {

    public static void main(String ags[]){
        int N = 10000000;

        //useless loop
        for(int i=0; i<N; i++){
            double n = 100*Math.random();
            n = Math.sqrt(n);
        }
                

        //time random generation
        long t1 = System.nanoTime();
        for(int i=0; i<N; i++){
            double n = 100*Math.random();
        }
        long t2 = System.nanoTime();
        System.out.println("Random Gen: "+ (t2-t1));
        System.out.println("Single Random Gen: "+ (t2-t1)/N);

        //time sqrt+random generation
        long t3 = System.nanoTime();
        for(int i=0; i<N; i++){
            double n = 100*Math.random();
            n = Math.sqrt(n);
        }
        long t4 = System.nanoTime();
        System.out.println("Random Gen + Sqrt: "+ (t4-t3));        
        System.out.println("Single Random Gen + Sqrt: "+ (t4-t3)/N);     
        
        System.out.println((t4-t3)-(t2-t1));

    }
    
}
