class NumberTask implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Worker Thread: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class RunnableThreadExample {

    public static void main(String[] args) {

        // Create Runnable object
        NumberTask task = new NumberTask();

        // Create Thread object
        Thread thread = new Thread(task);

        // Start the thread
        thread.start();

        // Main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}