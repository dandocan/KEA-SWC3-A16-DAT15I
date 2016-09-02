package dk.kea.swc3.week35.adt;

/**
 * Created by coag on 30-08-2016.
 */
public class Run {

    public static void main(String[] args) {
        MyList<String> nos = new MyList();
        nos.add("A");
        nos.add("C");
        nos.add("D");
        nos.add("E");
        nos.add("F");



        //System.out.println("Removed: " + nos.remove(-1));
//        System.out.println("Removed: " + nos.remove(0));
//        System.out.println("Removed: " + nos.remove(4));
//        System.out.println("Removed: " + nos.remove(5));
//        System.out.println("Removed: " + nos.remove(50));

        System.out.println(nos);
        nos.clear();
        System.out.println("the new list is "+nos);
/*
        try {
            nos.add(1, "B");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Hi from catch");
            return;
            //System.exit(0);
        } finally {
            System.out.println("hi from finally");
        }

        System.out.println(nos);
        System.out.println(nos.size());
*/
    }
}
