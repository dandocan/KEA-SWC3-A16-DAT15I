package dk.kea.swc3.week36;

/**
 * Created by coag on 06-09-2016.
 */
public class Run {

    public static boolean isPrime(long n) {
        //throw new NotImplementedException();
        if (n != 2 && n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LongCounter lc = new LongCounter(); // 0
        long max = 10_000_000;
        int noOfThreads = 4;

        Thread[] threads = new Thread[noOfThreads];
        for (int i = 0; i < noOfThreads; i++) {
            final int temp = i;
            Thread t = new Thread(() -> {
                System.out.println("starting " + Thread.currentThread().getName());
                for (int j = (int) (temp * (max / noOfThreads));
                     j < (temp + 1) * (max / noOfThreads);
                     j++) {
                    if (isPrime(j)) {
                        lc.increment();
                    }
                }
            });
            threads[i] = t;
        }

        long start = System.currentTimeMillis();
        for (Thread t : threads) {
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (Exception e) {
            }
        }
        long stop = System.currentTimeMillis();
        System.out.println("No of Threads: " + noOfThreads);
        System.out.println("Execution time was " + (stop - start) + "ms");
        System.out.println(lc.get());


        /*
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting " + Thread.currentThread().getName());
                for (long i = 2; i <= max; i++) {
                    if (isPrime(i)) {
                        lc.increment();
                    }
                }
            }
        });


        long start = System.currentTimeMillis();
        t.start();
        try {
            t.join();
        } catch (Exception e) {
        }
        long stop = System.currentTimeMillis();
        System.out.println("No of Threads: " + noOfThreads);
        System.out.println("Execution time was " + (stop-start) + "ms");
        System.out.println(lc.get());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting " + Thread.currentThread().getName());
                for (long i = 2; i <= max / 2; i++) {
                    if (isPrime(i)) {
                        lc.increment();
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Starting " + Thread.currentThread().getName());
            for (long i = ((max / 2) + 1); i <= max; i++) {
                if (isPrime(i)) {
                    lc.increment();
                }
            }
        });

        long start = System.currentTimeMillis();
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }
        long stop = System.currentTimeMillis();
        System.out.println("No of Threads: " + noOfThreads);
        System.out.println("Execution time was " + (stop-start) + "ms");
        System.out.println(lc.get());
    */
    }
}
