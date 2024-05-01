class LongRunningTask implements Runnable {
    public void run() {
        // Simulating a long-running task (sorting a large list)
        try {
            Thread.sleep(5000); // Simulate 5 seconds of sorting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ProgressBarUpdater implements Runnable {
    public void run() {
        int totalTime = 5000; // Total time for the task (in milliseconds)
        int interval = 1000; // Update interval for the progress bar (in milliseconds)
        int progress = 0;

        while (progress <= totalTime) {
            int percentage = (int) (((double) progress / totalTime) * 100);
            System.out.println("Progress: " + percentage + "%");

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            progress += interval;
        }
    }
}

public class p12 {
    public static void main(String[] args) {
        Thread longRunningTaskThread = new Thread(new LongRunningTask());
        Thread progressBarThread = new Thread(new ProgressBarUpdater());

        longRunningTaskThread.start();
        progressBarThread.start();
    }
}
