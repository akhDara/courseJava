package Homework7;

public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int appetite) {
        food -= appetite;
    }
    public void increaseFood(int appetite) {
        food += appetite;
    }
    public void info() {
        System.out.println("Всего еды: " + food);
    }
}
