package dk.kea.swc3.week34;

/**
 * Created by coag on 30-08-2016.
 */
public class Animal extends Creature implements Accable {
    private String name;

    @Override
    public void setName(String name) {
        this.name = "A"+name;
    }

    @Override
    public void foo() {

    }

    @Override
    public void run() {

    }
}
