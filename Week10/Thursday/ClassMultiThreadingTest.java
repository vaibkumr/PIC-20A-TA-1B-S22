public class MultiThreadingTest {
    public static void main(String args[]){
        // MyThread t = new MyThread();
        // t.start();

        for(int i=0; i<10; i++){
            MyThread t = new MyThread();
            t.start();
        }

    }
    
}
class MyThread extends Thread {
    public void run(){
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    }
}

