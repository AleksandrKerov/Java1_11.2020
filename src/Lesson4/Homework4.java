package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '•';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        initMap();
        printMap();

        while (true) {
            humanTurn();
            if (isEndGame(DOT_X)) {
                break;
            }

            aiTurn();
            if (isEndGame(DOT_O)) {
                break;
            }
        }
    }

    static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();
        }
    }

    static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("input coord X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;
    }

    static void aiTurn() {
        int x;
        int y;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_O;
                    if (checkWin(DOT_O, DOTS_TO_WIN)) {
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWin(DOT_X, DOTS_TO_WIN)) {
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }

    static boolean isCellValid(int y, int x) {
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkStraight(int line, int column, int y, int x, char playerSymbol, int dotsToWin) {
        if (line + y * (dotsToWin - 1) > SIZE - 1 || column + x * (dotsToWin - 1) > SIZE - 1 ||
                line + y * (dotsToWin - 1) < 0) {
            return false;
        }
        for (int i = 0; i < dotsToWin; i++) {
            if (map[line + i * y][column + i * x] != playerSymbol)
                return false;
        }
        return true;
    }

    public static boolean checkWin(char playerSymbol, int dotsToWin) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkStraight(i, j, 0, 1, playerSymbol, dotsToWin)) {
                    return true;
                }
                if (checkStraight(i, j, 1, 0, playerSymbol, dotsToWin)) {
                    return true;
                }
                if (checkStraight(i, j, 1, 1, playerSymbol, dotsToWin)) {
                    return true;
                }
                if (checkStraight(i, j, -1, 1, playerSymbol, dotsToWin)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isEndGame(char playerSymbol) {
        printMap();
        if (checkWin(playerSymbol, DOTS_TO_WIN)) {
            System.out.println("Win " + playerSymbol);
            return true;
        } else if (isFull()) {
            System.out.println("Draw");
            return true;
        }
        return false;
    }

}
