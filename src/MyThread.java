public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=1 ;i<=5 ;i++){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        MyThread task1 = new MyThread();
        MyThread task2 = new MyThread();
        task1.start();
        task2.start();
    }
}
