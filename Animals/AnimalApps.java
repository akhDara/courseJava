package Animals;

public class AnimalApps {

    public static void main(String[] args) {

        Cats cat1 = new Cats("Пушок");
        Cats cat2 = new Cats("Бегемот");

        Dogs dog1 = new Dogs("Фагот");
        Dogs dog2 = new Dogs("Азазелло");

        System.out.println("Информация о котах:");
        cat1.animalInfo();
        cat2.animalInfo();
        System.out.println();

        System.out.println("Информация о cобаках:");
        dog1.animalInfo();
        dog2.animalInfo();
        System.out.println();


        System.out.println("Первый кот:");
        cat1.run(150);
        cat1.swim(15);
        cat1.jump(1.5);
        System.out.println();

        System.out.println("Второй кот:");
        cat2.run(200);
        cat2.swim(5);
        cat2.jump(1);

        System.out.println();

        System.out.println("Первая собака:");
        dog1.run(350);
        dog1.swim(10);
        dog1.jump(3);
        System.out.println();

        System.out.println("Вторая собака:");
        dog2.run(100);
        dog2.swim(17);
        dog2.jump(1.5);
        System.out.println();

    }

}
