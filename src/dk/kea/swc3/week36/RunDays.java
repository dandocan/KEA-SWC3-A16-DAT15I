package dk.kea.swc3.week36;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by coag on 09-09-2016.
 */
public class RunDays {

    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.DATE)+"-"+cal.get(Calendar.MONTH)+
                "-"+cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
    }
}
