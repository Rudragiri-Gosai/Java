class ThreadOne implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Thread-I");
                Thread.sleep(2500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadTwo implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Thread-II");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadThree implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Thread-III");
                Thread.sleep(7500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class p7 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadOne());
        Thread thread2 = new Thread(new ThreadTwo());
        Thread thread3 = new Thread(new ThreadThree());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
