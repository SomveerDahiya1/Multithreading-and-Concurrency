public class RunnableThread {
    public static void task1(){
        for(int i=1 ;i<=5 ;i++){
            System.out.print(i+" ");
        }
    }

    public static void task2(){
        for(int i=6 ;i<=10 ;i++){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(()->task1());
        Thread thread2 = new Thread(()->task2());

        thread1.start();
        thread2.start();

    }
}
