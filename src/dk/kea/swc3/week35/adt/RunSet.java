package dk.kea.swc3.week35.adt;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by coag on 02-09-2016.
 */
public class RunSet {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("Bob");
        stringSet.add("Cay");
        stringSet.add("Alice");
        stringSet.add("Bob");
        if(stringSet.contains("Bob")){
            stringSet.add("David");
        }

        for (String s: stringSet) {
            System.out.println(s);
        }

        System.out.println(stringSet);
    }
}
