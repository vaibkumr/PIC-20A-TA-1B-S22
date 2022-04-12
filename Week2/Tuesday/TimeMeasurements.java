public class TimeMeasurements {

    public static void doSomething(){
        int a = 10;
        int b = 20;
        int c = a*b + a + b;
    }

    public static void printSystemTime(){
        System.out.println(System.nanoTime());
    }

    public static void measureSingle(){
        long startTime = System.nanoTime();    
        doSomething();
        long timeElapsed = System.nanoTime() - startTime;
        System.out.println(timeElapsed);
    }

    public static void measureMultiple(int n){
        long totalTime = 0;
        for(int i=0; i<n; i++){
            long startTime = System.nanoTime();    
            doSomething();
            totalTime += (System.nanoTime() - startTime);
        }
        System.out.println(totalTime/n);
    }

    public static void measureMultiple_mic(int n){
        long totalTime = 0;
        long startTime = System.nanoTime();    
        for(int i=0; i<n; i++){
            doSomething();
        }
        totalTime = (System.nanoTime() - startTime);
        System.out.println(totalTime/n);
    }    
    
    public static void measureMultipleWihtnumSkips(int n, int numSkips){
        if(numSkips > n){
            System.out.println("Skip run count can't be larger than or equal to total run count.");
            return;
        }
        long totalTime = 0;
        for(int i=0; i<n; i++){
            long startTime = System.nanoTime();    
            doSomething();
            if(i>numSkips)
                totalTime += (System.nanoTime() - startTime);
        }
        System.out.println(totalTime/(n-numSkips));
    }    
    public static void main(String[] args){
        // printSystemTime();
        // measureSingle();
        measureMultiple(100);
        measureMultiple_mic(100);

        // measureMultiple(1);
        // measureMultipleWihtnumSkips(100, 50);
    }
    
}
