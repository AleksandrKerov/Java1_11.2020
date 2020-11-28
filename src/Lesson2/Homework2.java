package Lesson2;

public class Homework2 {
    public static void main(String[] args) {
    System.out.println("Первое задание: ");
    int[] taskOne = {1, 0, 1, 1, 1, 0, 0, 1};
    printArr(taskOne);
    changeZeroOne(taskOne);
    printArr(taskOne);

        System.out.print("Второе задание: ");
    int[] taskTwo = new int[8];
    progressive(taskTwo);
    printArr(taskTwo);

        System.out.print("Третье задание: ");
    int[] taskThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    fromSmallToBig(taskThree);
    printArr(taskThree);

        System.out.print("Четвертое задание:\n");
    int size = 5;
    int[][] taskFour = new int[size][size];
    diagonal(taskFour, size);
    printArr(taskFour);

        System.out.print("Пятое задание: ");
    int[] taskFive = {11, 5, 3, 2, 22, 4, 5, 2, 4, 8, 9};
    maxAndMin(taskFive);

        System.out.println("Шестое задание: ");
    int[] taskSix = {6, 2, 1, 3, 5, 7};
    boolean check = checkBalance(taskSix);
        System.out.println(check);

    //7 задание change < 0 - сдвиг вправо, change > 0 - сдвиг влево
        System.out.println("Седьмое задание: ");
    int change = 1;
    int[] taskSeven = {1, 2, 3, 4, 5};
    printArr(taskSeven);
    changePosition(taskSeven, change);
    printArr(taskSeven);

}

    //печать одномерного массива
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    //печать двумерного массива
    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //задание 1
    static void changeZeroOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    //задание 2
    static void progressive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
    }

    //задание 3
    static void fromSmallToBig(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    //задание 4
    static void diagonal(int[][] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == j) || (i == size - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }
    }

    //задание 5
    static void maxAndMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (max <= i) {
                max = i;
            }
            if (min >= i) {
                min = i;
            }
        }
        System.out.println("максимальное значение " + max + ", минимальное значение " + min);
    }

    //6 задание
    static boolean checkBalance(int[] arr) {
        float sum = 0f;
        for (int i = 0; i < (arr.length); i++) {
            sum = arr[i] + sum;
        }
        float sumLeftPart = 0f;
        for (int i = 0; i < (arr.length); i++) {
            sumLeftPart = arr[i] + sumLeftPart;
            if (sumLeftPart >= (sum / 2)) {
                return (sum / 2) == sumLeftPart;
            }
        }
        return (sum / 2) == sumLeftPart;
    }

    //7 задание
    static void changePosition(int[] arr, int x) {
        if (x >= 0) {
            for (int i = 0; i < x; i++) {
                int temp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }
        } else {
            for (int i = 0; i > x; i--) {
                int temp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
        }
    }
}
