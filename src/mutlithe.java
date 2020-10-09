import java.util.*;
public class mutlithe extends Thread {
    public static void main(String[] args) throws Exception{
        Counter myobj = new Counter();
        //myobj.incrementScore();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for(int i=0;i<800;i++) {
                    myobj.incrementScore();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for(int i=0;i<800;i++) {
                    myobj.incrementScore();
                }
            }
        });


        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("count = "+myobj.count);
    }
}

class Counter {
    int count;
    public synchronized void incrementScore() {
        count++;
    }
}