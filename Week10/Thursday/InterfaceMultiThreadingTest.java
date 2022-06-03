public class InterfaceMultiThreadingTest {
    public static void main(String args[]){
        for(int i=0; i<10; i++){
            Thread t = new Thread(new MyThread());
            t.start();
        }
    }
    
}


class MyThread implements Runnable {
    public void run(){
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    }
}