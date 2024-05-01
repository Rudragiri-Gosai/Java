class EvenNumberPrinter implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddNumberPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class p11 {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenNumberPrinter());
        Thread oddThread = new Thread(new OddNumberPrinter());

        evenThread.start();
        oddThread.start();
    }
}
