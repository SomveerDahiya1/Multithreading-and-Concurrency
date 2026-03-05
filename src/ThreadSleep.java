public class ThreadSleep {
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
    public static void main(String[] args){
        Runnable run1 = ()-> {
            try {
                intro();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread introThread = new Thread(run1);
        introThread.start();
    }
}
