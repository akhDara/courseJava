package Animals;

import Animals.Animals;

public class Cats extends Animals {
        public Cats(String name) {
            super(name);
            this.runConstrains = random.nextInt(199) + 1;
            this.jumpConstrains = random.nextInt(15);
            this.animal = "Кот";
        }

        @Override
        public void swim(int distance) {
            System.out.println("Коты не плавают");
        }
}
