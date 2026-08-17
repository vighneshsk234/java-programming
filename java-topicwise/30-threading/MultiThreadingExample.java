class DownloadTask extends Thread {

    private String fileName;

    DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(fileName + " - Downloading " + (i * 20) + "%");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(fileName + " interrupted.");
            }
        }

        System.out.println(fileName + " - Download Complete!");
    }
}

class MusicTask extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Music - Playing " + i + " second");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Music thread interrupted.");
            }
        }

        System.out.println("Music stopped.");
    }
}

public class MultiThreadingExample {

    public static void main(String[] args) {

        DownloadTask download = new DownloadTask("Java.pdf");
        MusicTask music = new MusicTask();

        // Start both threads
        download.start();
        music.start();

        System.out.println("Main thread is running...");
    }
}