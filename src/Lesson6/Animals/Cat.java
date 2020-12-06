package Lesson6.Animals;

public class Cat extends Animal {
    private static int quantityOfCats;

    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        quantityOfCats++;
    }

    public static int getQuantityOfCats() {
        return quantityOfCats;
    }
}
