package dk.kea.swc3.week36;

/**
 * Created by coag on 06-09-2016.
 */
public class Run {

    public static void main(String[] args) {
        LongCounter lc = new LongCounter(); // 0
        long max = 10_000_000;

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < max; i++) {
                    lc.increment();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < max; i++) {
                lc.increment();
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
