class DivisibleByThree implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

class DivisibleByFive implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

public class p4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new DivisibleByThree(), "Thread 1");
        Thread thread2 = new Thread(new DivisibleByFive(), "Thread 2");

        thread1.start();
        thread2.start();
    }
}
