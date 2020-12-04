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

        //1 вариант
        for (int i = 0; i < animals.length; i++) {
            System.out.printf("%s tries to run %d meters. Did it manage? %b\n", animals[i].name, distanceToRun, animals[i].run(distanceToRun));
            System.out.printf("%s tries to swim %d meters. Did it manage? %b\n\n", animals[i].name, distanceToRun, animals[i].swim(distanceToSwim));
        }

        //2 вариант
        for (int i = 0; i < animals.length; i++) {
            animals[i].running(distanceToRun);
            animals[i].swimming(distanceToSwim);
        }
        //какой вариант лучше? Слышал такое мнение, что животное не должно уметь само что-то говорить о своих способностях :)

        //Хотел сделать метод printQuantity, в который передается Геттер и который бы писал "Количество *** Cat.getQuantityOfCats"
        //Но как вместо *** назначить наименование класса?
        System.out.println("Quantity of animals is " + Animal.getQuantityOfAnimals());
        System.out.println("Quantity of cats is " + Cat.getQuantityOfCats());
        System.out.println("Quantity of dogs is " + Dog.getQuantityOfDogs());

//        printQuantity(Cat.getQuantityOfCats());
    }

//    public static void printQuantity(int quantity){
//        System.out.printf("Quantity of %s is %d", КЛАСС, quantity);
//    }
}
