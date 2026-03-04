public class CompareTest {

    public void task1(){
        System.out.println("--Task 1--");
        for(int i=1 ;i<=1000;i++){
            System.out.printf("%d* ",i);
        }
    }
    public void task2(){
        System.out.println("\n--Task 2--");
        for(int i=1 ;i<=1000;i++){
            System.out.printf("%d# ",i);
        }
    }
    public void task3(){
        System.out.println("\n--Task 3--");
        for(int i=1 ;i<=1000;i++){
            System.out.printf("%d+ ",i);
        }
    }
    public static void main(String[] args) {
        CompareTest cT = new CompareTest();
        System.out.println("Workflow without MultiThreading");
        long startTime = System.currentTimeMillis();
        cT.task1();
        cT.task2();
        cT.task3();
        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal Time taken: "+(endTime-startTime));

        Thread t1 = new Thread(()->cT.task1());
        Thread t2 = new Thread(()->cT.task2());
        Thread t3 = new Thread(()->cT.task3());

        System.out.println("Workflow with MultiThreading");
        long startTime1 = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        long endTime1 = System.currentTimeMillis();
        System.out.println("\nTotal Time taken: "+(endTime1-startTime1));



    }
}
