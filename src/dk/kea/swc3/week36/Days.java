package dk.kea.swc3.week36;

/**
 * Created by coag on 09-09-2016.
 */
public enum Days {
    SUN,
    MON,
    TUE,
    WED,
    THR,
    FRI,
    SAT;

    @Override
    public String toString() {
        return "The day is: " + this.name();
    }
}
