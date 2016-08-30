package dk.kea.swc3.week35.adt;

import java.util.List;

/**
 * Created by coag on 30-08-2016.
 */
public class MyList<T> {
    private int size;
    private T[] data;

    public MyList() {
        size = 0;
        data = (T[]) new Object[2];
    }

    public void add(T elemenet) {

        if (size >= data.length) {
            T[] temp = (T[]) new Object[size + 10];
            for (int i = 0; i < size; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        data[size++] = elemenet;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += data[i] + " ";
        }
        return result;
    }
}
