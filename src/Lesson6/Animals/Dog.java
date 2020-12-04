package Lesson6.Animals;

public class Dog extends Animal {
    private static int quantityOfDogs;

    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        quantityOfDogs++;
    }

    public static int getQuantityOfDogs() {
        return quantityOfDogs;
    }
}

