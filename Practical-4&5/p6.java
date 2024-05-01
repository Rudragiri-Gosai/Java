class EvenNumbersPrinter implements Runnable {
    public void run() {
        for (int i = 2; i <= 50; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

class OddNumbersPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EvenNumbersPrinter evenNumbersPrinter = new EvenNumbersPrinter();
        OddNumbersPrinter oddNumbersPrinter = new OddNumbersPrinter();

        Thread thread1 = new Thread(evenNumbersPrinter, "Even Numbers Thread");
        Thread thread2 = new Thread(oddNumbersPrinter, "Odd Numbers Thread");

        thread1.start();
        thread2.start();
    }
}
