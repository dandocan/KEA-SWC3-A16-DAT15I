package dk.kea.swc3.week36;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by coag on 06-09-2016.
 */
public class Run {

    public static boolean isPrime(long n) {
        //throw new NotImplementedException();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        LongCounter lc = new LongCounter(); // 0
        long max = 10_000_000;

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting "+Thread.currentThread().getName());
                for (long i = 2; i <= max / 2; i++) {
                    if (isPrime(i)) {
                        lc.increment();
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Starting "+Thread.currentThread().getName());
            for (long i = ((max / 2) + 1); i <= max; i++) {
                if (isPrime(i)) {
                    lc.increment();
                }
            }
        });


        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }
        System.out.println(lc.get());
    }
}
