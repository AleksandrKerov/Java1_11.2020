package Lesson1;

public class Homework1 {
    public static void main(String[] args){
        byte b = 1;
        short s = 2;
        int i;
        i = 3;
        long l = 4L;
        float f = 5.5f;
        double d = 6.1;
        char symb = 'c';
        boolean bool = true;

        calculation();
        System.out.println(interval(20, 10));
        isNumberPositive(5);
        System.out.println(isNumberNegative(-5));
        hello("Ivan");
        isYearLeap(2020);
    }

    public static void calculation(){
        float a = 3f;
        float b = 1f;
        float c = 4f;
        float d = 2f;
        float x = a * (b+(c/d));
        System.out.println(x);
    }

    public static boolean interval(int a, int b){
        return a + b >= 10 && a + b <= 20;
    }

    public static void isNumberPositive (int a){
        if(a >= 0){
            System.out.println("Число пололожительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean isNumberNegative (int a){
        return a < 0;
    }

    public static void hello(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void isYearLeap(int a){
        if(a % 400 == 0 || a % 4 == 0 && a % 100 != 0){
            System.out.println("Год високосный");
        } else {
            System.out.println("Год НЕвисокосный");
        }
    }
}
