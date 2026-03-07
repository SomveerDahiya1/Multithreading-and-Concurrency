package ParallelPrimeFinder ;

class PrimeTask implements Runnable {

    int start;
    int end;

    PrimeTask(int start, int end) {
        this.start = start;
        this.end = end;
    }
    boolean isPrime(int num)
    {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
            }
        }
    }
}

public class ParallelPrimeFinder {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new PrimeTask(1, 25000), "Worker-1");
        Thread t2 = new Thread(new PrimeTask(25001, 50000), "Worker-2");
        Thread t3 = new Thread(new PrimeTask(50001, 75000), "Worker-3");
        Thread t4 = new Thread(new PrimeTask(75001, 100000), "Worker-4");
        long startTime = System.currentTimeMillis(); //Start Time
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        long endTime = System.currentTimeMillis();

        System.out.println("\nTime Taken: " + (endTime - startTime) + " ms"); // Total time
    }
}