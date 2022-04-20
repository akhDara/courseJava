package Homework7;
import java.util.Scanner;

public class App {

    public static Scanner Scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cats[] Cats = new Cats[4];
        Cats[0] = new Cats("Барсик", 20, false);
        Cats[1] = new Cats("Боб", 15, false);
        Cats[2] = new Cats("Кисун", 10, false);
        Cats[3] = new Cats("Сэм", 25, false);


        Plate plate = new Plate(65);
        plate.info();
        for (int i = 0; i < Cats.length; i++) {
            if (Cats[i].satiety == false && Cats[i].appetite < plate.food){
                Cats[i].eat(plate);
                Cats[i].satiety = true;
                System.out.println(Cats[i].name + " покушал");
            } else {
                System.out.println(Cats[i].name + " капризничает");
            }
        }
        plate.info();
        System.out.println("Сколько грамм корма добавить еще в миску? (введите число): ");
        action = Scanner.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}
