import java.util.Arrays;

/**
 * Created by coag on 02-09-2016.
 */
public class JavaTricky {

    public static void main(String[] args) {
        /*
        //Q.1
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println(Math.min(Integer.MIN_VALUE, 0));
        //Q.2
        System.out.println(1.0/.0);
        */

        //Q.3
        // FIXME: 06-09-2016
        char[] chars = new char[] {'\u0097'};
        String str = new String(chars);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

    }
}
