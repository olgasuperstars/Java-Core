package Lesson3;

public class Fruit <T, S>{
    private T fruit1;
    private S fruit2;
    private int weight;

    public Fruit(T fruit1, S fruit2) {
        this.fruit1 = fruit1;
        this.fruit2 = fruit2;
    }

    public T getFruit1() {
        return fruit1;
    }

    public void setFruit1(T fruit1) {
        this.fruit1 = fruit1;
    }

    public S getFruit2() {
        return fruit2;
    }

    public void setFruit2(S fruit2) {
        this.fruit2 = fruit2;
    }

    public Fruit(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
