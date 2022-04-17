package Animals;

import java.util.Random;
public class Animals {
    protected String name;
    protected String animal;
    protected int runConstrains;
    protected int swimConstains;
    protected double jumpConstrains;
    public Random random = new Random();

    public Animals(String name){
        this.name = name;
    }
    public void run(int distance) {
        if (this.runConstrains >= distance) {
            System.out.println(this.animal + " " + this.name + " пробежал: " + distance + " м.");
        }
        else {
            System.out.println(this.animal + " " + this.name + " не смог пробежать заданное расстояние");
        }
    }
    public void jump(double height) {
        if (this.jumpConstrains >= height)
            System.out.println(this.animal + " " + this.name + " прыгнул: " + height + " м.");
        else System.out.println(this.animal + " " + this.name + " не смог прыгнуть на заданную длину");
    }
    public void swim(int distance) {
        if (this.swimConstains >= distance) {
            System.out.println(this.animal + " " + this.name + " проплыл: " + distance + " м.");
        } else {
            System.out.println(this.animal + " " + this.name + " не смог проплыть заданное расстояние");
        }
    }

    public void animalInfo() {
        System.out.println(this.animal + " " + this.name + " пробежит: " + this.runConstrains + " м., проплывет: "
                + this.swimConstains
                + " м., прыгнет: " + this.jumpConstrains + " m.");
    }
}
