public class ThreadPriority {
    public static void main(String[] args) {
        CompareTest cT = new CompareTest();

        Thread t1 = new Thread(()->cT.task1());
        Thread t2 = new Thread(()->cT.task2());
        Thread t3 = new Thread(()->cT.task3());

        t1.setPriority(Thread.MIN_PRIORITY);//Giving priority of 1 to t1  3rd
        t2.setPriority(Thread.MAX_PRIORITY);//Giving priority of 10 to t2 1st
        t3.setPriority(Thread.NORM_PRIORITY);//Giving priority of 5 to t3  2nd

        t1.start();
        t2.start();
        t3.start();
    }
}
