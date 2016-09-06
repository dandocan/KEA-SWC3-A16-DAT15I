package dk.kea.swc3.week36;

/**
 * Created by coag on 06-09-2016.
 */
public class LongCounter {
    private long count;

    public void increment(){
        count = count + 1;
    }

    public long get() {
        return count;
    }
}
