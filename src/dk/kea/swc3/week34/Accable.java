package dk.kea.swc3.week34;

import java.io.Serializable;

/**
 * Created by coag on 30-08-2016.
 */
public interface Accable extends Runnable, Serializable{

    public abstract void foo();
    public static void boo(){
        System.out.println("hi");
    }

}
