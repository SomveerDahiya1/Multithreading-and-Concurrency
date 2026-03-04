public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        CompareTest cT = new CompareTest();

        Thread t1 = new Thread(()->cT.task1());
        Thread t2 = new Thread(()->cT.task2());
        Thread t3 = new Thread(()->cT.task3());

        t1.start();
        t2.start();
        t1.join(); //join method does not allow t3 to start before t1 not complete.
        t3.start();
    }
}
