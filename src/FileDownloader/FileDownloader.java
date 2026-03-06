package FileDownloader ;
public class FileDownloader {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new DownloadTask(1), "Thread-1");
        Thread t2 = new Thread(new DownloadTask(2), "Thread-2");
        Thread t3 = new Thread(new DownloadTask(3), "Thread-3");

        System.out.println("Download Started...\n");
        t1.start();
        t2.start();
        t3.start();

        // wait for all downloads
        t1.join();
        t2.join();
        t3.join();
        System.out.println("\nAll file parts downloaded successfully!");
    }
}