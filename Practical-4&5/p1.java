class Counter {
    private int count = 0;

    // synchronized Keyword helpp us to use same method simultenously
    public synchronized void incre() {
        count++;
    }

    public synchronized int getc() {
        return count;
    }
}

public class p1 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        // Thread class is used to use any method at same time with its class object.
        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    c.incre();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Final Count: " + c.getc());
    }
}
