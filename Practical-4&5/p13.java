import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Producer implements Runnable {
    private Queue<Double> buffer;
    private int maxSize;

    public Producer(Queue<Double> buffer, int maxSize) {
        this.buffer = buffer;
        this.maxSize = maxSize;
    }

    public void run() {
        while (true) {
            synchronized (buffer) {
                while (buffer.size() == maxSize) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                Random random = new Random();
                double number = random.nextDouble();
                buffer.add(number);
                System.out.println("Produced: " + number);
                buffer.notifyAll(); // Notify consumers
            }
        }
    }
}

class Consumer implements Runnable {
    private Queue<Double> buffer;

    public Consumer(Queue<Double> buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                double number = buffer.poll();
                double sqrt = Math.sqrt(number);
                System.out.println("Consumed: " + number + ", Square Root: " + sqrt);
                buffer.notifyAll(); // Notify producers
            }
        }
    }
}

public class p13 {
    public static void main(String[] args) {
        Queue<Double> buffer = new LinkedList<>();
        int maxSize = 10;

        Thread producerThread = new Thread(new Producer(buffer, maxSize));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}
