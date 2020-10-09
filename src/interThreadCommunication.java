public class interThreadCommunication {
    public static void main(String[] args) {
        Q q = new Q();
        new producer(q);
        new consumer(q);
    }
}

class Q {
    int i;
    boolean isValueSet = false;

    public synchronized void set(int i) {
        while(isValueSet) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("print e = "+e);
            }
        }
        System.out.println("Set = "+i);
        this.i =i;
        isValueSet = true;
        notify();
    }

    public synchronized void get() {
        while(!isValueSet) {
            try {
                wait();
            } catch (Exception e){
                System.out.println("print e = "+e);
            }
        }
        System.out.println("Get = "+i);
        isValueSet = false;
        notify();
    }
}

class producer implements Runnable{
    Q q;
    producer(Q q) {
        this.q = q;
        Thread t1 = new Thread(this,"ProducerThread");
        t1.start();
    }

    public void run() {
        int i=0;
        while(true) {
            q.set(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("print e = "+e);
            }
        }
    }
}

class consumer implements Runnable {
    Q q;
    consumer(Q q) {
        super();
        this.q = q;
        Thread t2 = new Thread(this,"ConsumerThread");
        t2.start();
    }

    public void run() {
        while(true) {
            q.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("print e = "+e);
            }
        }
    }
}