package UtubeThreading;

public class UtubeThreads {
    public static void intro() throws InterruptedException {
        for(int i=1;i<=5;i++){
            System.out.print("- ");
            Thread.sleep(300);
        }
        char [] welcome = {'W','e','l','c','o','m','e'};
        for(int i=0;i<welcome.length;i++){
            System.out.print(welcome[i]);
            Thread.sleep(200);
        }
        for(int i=1;i<=5;i++){
            System.out.print("- ");
            Thread.sleep(300);
        }
    }
    public static void playingVideo() throws InterruptedException {
        char  videoText[] = "Playing Video".toCharArray();
        for(int i=0;i<videoText.length;i++){
            System.out.print(videoText[i]);
            Thread.sleep(10);
        }
        for(int i=1;i<=3;i++){
            System.out.print(".");
            Thread.sleep(10000);
        }
    }public static void downloadingVideo() throws InterruptedException {
        char  downloadText[] = "Downloading Video".toCharArray();
        for(int i=0;i<downloadText.length;i++){
            System.out.print(downloadText[i]);
            Thread.sleep(10);
        }
        for(int i=1;i<=5;i++){
            System.out.print(".");
            Thread.sleep(5000);
        }
        System.out.println("Download Successfully");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(()-> {
            try {
                intro();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(()-> {
            try {
                playingVideo();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread3 = new Thread(()-> {
            try {
                downloadingVideo();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread4 = new Thread(()-> {
            try {
                playingVideo();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();//Application Into or Startup
        thread1.join();
        thread2.start(); //Video playing
        thread3.start();//Downloading Video


    }
}
