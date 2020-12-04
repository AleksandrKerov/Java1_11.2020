package Lesson6.Animals;

public abstract class Animal {
    public String name;
    public int maxRun;
    public int maxSwim;
    private static int quantityOfAnimals;

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        quantityOfAnimals++;
    }

    public boolean run(int distance) {
        return maxRun >= distance;
    }

    public boolean swim(int distance) {
        return maxSwim >= distance;
    }

    public void running(int distnace){
        if(maxRun>= distnace){
            System.out.printf("%s has run %d\n", name, distnace);
        } else {
            System.out.printf("%s has not run %d. Maximum distance is %d\n", name, distnace, maxRun);
        }
    }

    public void swimming(int distnace){
        if(maxSwim>= distnace){
            System.out.printf("%s has swum %d\n", name, distnace);
        } else {
            System.out.printf("%s has not swum %d. Maximum distance is %d\n", name, distnace, maxSwim);
        }
    }

    public static int getQuantityOfAnimals() {
        return quantityOfAnimals;
    }
}
