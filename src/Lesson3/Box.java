package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T> {
    private T[] object;

    public Box(T object) {
        this.object = (T[]) object;
    }

    public T getObject() {
        return (T) object;
    }

    public void setObject(T object) {
        this.object = (T[]) object;
    }

    @Override
    public String toString() {
        return "Box{" +
                "object=" + Arrays.toString(object) +
                '}';
    }

    public static void main(String[] args) {
//        Box<Fruit> orange = new Box<>("orange");
//        Box<Fruit> apple = new Box<>("apple");
//        ArrayList<Fruit> arrayListApp = new ArrayList<>("apple");
//        ArrayList<Fruit> arrayListOrn = new ArrayList<>("orange");

    }

    public static int getWeight() {
        return 0;
    }
}
