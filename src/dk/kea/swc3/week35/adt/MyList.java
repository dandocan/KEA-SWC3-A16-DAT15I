package dk.kea.swc3.week35.adt;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * Created by coag on 30-08-2016.
 */
public class MyList<T> {
    private int size;
    private T[] data;

    public MyList() {
        init();
    }

    private void init(){
        size = 0;
        data = (T[]) new Object[5];
    }


    public void add(T elemenet) {

        ensureCapacity();
        data[size++] = elemenet;
    }

    public void add(int index, T el) {
        if (index <= size && index >= 0) {
            ensureCapacity();
            for (int i = size; i > index; i--) {
                data[i] = data[i - 1];
            }
            data[index] = el;
            size++;
        } else {
            throw new RuntimeException("FU. Try again with a better index.");
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void clear(){
        init();
    }

    public T remove(int index){
        //throw new NotImplementedException();

        if(index >= 0 && index<size){
            T temp = data[index];
            for (int i = index+1; i < size; i++) {
                data[i-1] = data[i];
            }
            size--;
            return temp;
        } else {
            throw new RuntimeException("Your index is out of bounds");
        }
    }

    private void ensureCapacity(){
        if (size >= data.length) {
            T[] temp = (T[]) new Object[size + 10];
            for (int i = 0; i < size; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
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
