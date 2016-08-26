package dk.kea.swc3.week34.oop;

/**
 * Created by coag on 26-08-2016.
 */
public final class Car {
    private final String MODEL = "Tesla";
    private String color;



    public Car(){
        System.out.println("About to create a Car.");
    }
    {
        System.out.println("Alice here, from the darkside.");
    }

    public final void method(){

    }
    public int method(final int i){return 1;}

    public String getColor(){
        return color;
    }

    public static void main(String args[]) {
        System.out.println(args[0]);
        Car tesla = new Car();


    }

    public class Engine{}
}
