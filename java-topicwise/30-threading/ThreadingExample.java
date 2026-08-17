class MyTask extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Task is running: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class ThreadingExample {

    public static void main(String[] args) {

        MyTask task = new MyTask();

        // Starting the thread
        task.start();

        System.out.println("Main thread is running.");

    }
}