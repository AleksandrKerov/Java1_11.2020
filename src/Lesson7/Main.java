package Lesson7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        Cat[] cat = {
                new Cat("Barsik", (rand.nextInt(6) + 15)),
                new Cat("Murzik", (rand.nextInt(6) + 15)),
                new Cat("Fat", (rand.nextInt(6) + 15) * 2),
                new Cat("Skinny", (rand.nextInt(6) + 15) / 2),
        };

        Plate plate = new Plate(50);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
        }

        for (int i = 0; i < cat.length; i++) {
            cat[i].info();
        }

        plate.putFood(50);
        plate.info();
    }
}
