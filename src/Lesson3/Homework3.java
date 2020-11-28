package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        guessNumber();

        String[] words = {"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        guessWord(words);
    }

    public static void guessNumber() {
        Random rand = new Random();
        int numberAi = rand.nextInt(10);

        Scanner sc = new Scanner(System.in);
        System.out.print("Game: Guess the number!\nEnter the number from 0 to 9:");
        int numberUser = sc.nextInt();

        for (int i = 0; i < 2; i++) {
            if (numberUser != numberAi) {
                if (numberUser > numberAi) {
                    System.out.println("Too big");
                } else {
                    System.out.println("Too small");
                }
                System.out.print("Try again:");
                numberUser = sc.nextInt();
            } else {
                break;
            }
        }
        if (numberAi == numberUser) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
        System.out.println("Do you want to play again? 1 - YES, 0 - NO");
        int game = sc.nextInt();
        if (game == 1) {
            guessNumber();
        }
        sc.close();
    }

    public static void guessWord(String[] words) {
        Random rand = new Random();
        int wordsNumber = rand.nextInt(words.length);
        System.out.println(words[wordsNumber]);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the word: ");
            String wordUser = sc.nextLine();
            if (wordUser.equals(words[wordsNumber])) {
                System.out.println("You win!");
                break;
            } else {
                for (int i = 0; i < 15; i++) {
                    if (i < wordUser.length() && i < words[wordsNumber].length() &&
                            wordUser.charAt(i) == words[wordsNumber].charAt(i)) {
                        System.out.print(wordUser.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
            }
            sc.close();
        }
    }

}
