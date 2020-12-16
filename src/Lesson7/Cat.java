package Lesson7;

public class Cat {
    private String name;
    private int eatVolume;
    private boolean full = false;

    public Cat(String name, int eatVolume) {
        this.name = name;
        this.eatVolume = eatVolume;
    }

    public void eat(Plate plate) {
        System.out.printf("cat %s try to eat %d %s\n", name, eatVolume, plate);
        if (eatVolume < 0) {
            System.out.println("Bad cat!!! Get out of here!");
        } else {
            if (plate.getFood() < eatVolume) {
                System.out.println("Not enough food");
            } else {
                plate.decreaseFood(eatVolume);
                full = true;
            }
        }
    }

    public void info() {
        System.out.printf("%s is full - %s\n", name, full);
    }
}
