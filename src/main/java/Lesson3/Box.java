package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits;

    public Box(List<T> fruits) {
        if (fruits != null) {
            this.fruits = fruits;
        } else {
            this.fruits = new ArrayList<>();
        }
    }

    public double getWeight() {
        double weight = 0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box other){
        return this.getWeight() == other.getWeight();
    }

    public void addFruits(List<T> fruits){
        this.fruits.addAll(fruits);
    }

    public void addFruit(T fruit){
        this.fruits.add(fruit);
    }

    public void putAllToOther(Box<T> other){
        other.addFruits(this.fruits);
        this.fruits.clear();
    }

}
