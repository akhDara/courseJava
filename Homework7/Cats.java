package Homework7;

public class Cats extends App {
    public String name;
    public int appetite;
    public boolean satiety;

    public Cats(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }
}
