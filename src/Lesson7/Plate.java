package Lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public int getFood() {
        return food;
    }

    public int putFood(int food) {
        return this.food += food;
    }

    @Override
    public String toString() {
        return "(there is " + food + ")";
    }

    public void info() {
        System.out.println("Food: " + food);
    }
}
