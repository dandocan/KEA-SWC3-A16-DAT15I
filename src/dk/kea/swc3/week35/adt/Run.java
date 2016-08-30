package dk.kea.swc3.week35.adt;

/**
 * Created by coag on 30-08-2016.
 */
public class Run {

    public static void main(String[] args) {
        MyList<Integer> nos = new MyList();
        nos.add(5);
        nos.add(15);
        nos.add(19);
        nos.add(19);
        nos.add(19);

        System.out.println(nos);
        System.out.println(nos.size());

    }
}
