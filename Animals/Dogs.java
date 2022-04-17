package Animals;

import Animals.Animals;

public class Dogs extends Animals {
    public Dogs(String name) {
        super(name);
        this.animal = "Собака";
        this.runConstrains = random.nextInt(499) + 1;
        this.jumpConstrains = random.nextInt(10);
        this.swimConstains = 10;
    }
}
