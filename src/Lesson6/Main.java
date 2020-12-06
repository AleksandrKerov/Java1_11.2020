package Lesson6;

import Lesson6.Animals.Animal;
import Lesson6.Animals.Cat;
import Lesson6.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        int distanceToRun = 250;
        int distanceToSwim = 5;

        Animal[] animals = {
                new Cat("UsualCat1", 200, 0),
                new Cat("UsualCat2", 200, 0),
                new Cat("UsualCat3", 200, 0),
                new Cat("SuperCat", 300, 5),
                new Dog("Rex", 500, 10)
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].running(distanceToRun);
            animals[i].swimming(distanceToSwim);
        }

        System.out.println("Quantity of animals is " + Animal.getQuantityOfAnimals());
        System.out.println("Quantity of cats is " + Cat.getQuantityOfCats());
        System.out.println("Quantity of dogs is " + Dog.getQuantityOfDogs());
    }
}
