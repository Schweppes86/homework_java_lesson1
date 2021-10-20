package com.lessons.hw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson4Hw {
    private static final int SIZE = 5;
    private static final int DOT_TO_WIN = 4;
    private static final char DOT_X = 'X';
    private static final char DOT_0 = '0';
    private static final char DOT_EMPTY = '•';
    private static char[][] MAP;
    private static Scanner scanner;
    private static Random random;

    public static void main(String[] args) {
        MAP = new char [SIZE][SIZE];
        scanner = new Scanner(System.in);
        random =  new Random();

        initMap();
        printMap();
        while (true) {
            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("Человек победил!!!");
                break;
            }
            if (!hasEmptyCell()) {
                System.out.println("Ничья!");
                break;
            }

            robotTurn();
            if (checkWin(DOT_0)) {
                System.out.println("Робот победил!!!");
                break;
            }
            if (!hasEmptyCell()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }


    private static boolean checkWin(char symbol) {

        if (checkRow(symbol)) return true;
        if (checkCol(symbol)) return true;
        if (checkDiag(symbol)) return true;

        return false;
    }

    private static boolean checkRow(char symbol) {
        int checkSym;
        for (int row = 0; row < SIZE; row++) {
            checkSym = 0;
            for (int col = 0; col < SIZE; col++) {
                if (MAP [row][col] == symbol) {
                    checkSym += 1;
                }
                else {
                    checkSym = 0;
                }

                if (checkSym == DOT_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkCol(char symbol) {
        int checkSym;
        for (int col = 0; col < SIZE; col++) {
            checkSym = 0;
            for (int row = 0; row < SIZE; row++) {
                if (MAP [row][col] == symbol) {
                    checkSym += 1;
                }
                else {
                    checkSym = 0;
                }

                if (checkSym == DOT_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDiag(char symbol) {
        int checkRightSum, checkLeftSum;
        checkRightSum = checkLeftSum = 0;
        int lastIndex = SIZE - 1;

        for (int col = 0; col < SIZE; col++) {
                if (MAP [col][col] == symbol) {
                    checkRightSum += 1;
                }
                else {
                    checkRightSum = 0;
                }

                if (MAP [col][lastIndex - col] == symbol) {
                    checkLeftSum += 1;
                }
                else {
                    checkLeftSum = 0;
                }

                if (checkRightSum == DOT_TO_WIN || checkLeftSum == DOT_TO_WIN) {
                    return true;
                }

        }
        return false;
    }

    private static void humanTurn() {
        do {
            System.out.println("Введите строку: ");

            int row = readIndex();

            System.out.println("Введите столбец: ");
            int col = readIndex();

            if (assertInput(row) || assertInput(col)) {
                System.out.println("Введите значение в диапазоне от 1 до " + SIZE);
                continue;
            }

            if (emptyCell(row-1, col-1)) {
                MAP[row - 1][col - 1] = DOT_X;
                break;
            }
            else {
                System.out.println("Клетка занята");
            }
        }
        while (true);
        printMap();
    }

    private static void robotTurn() {
        int row,col;
        do {
            row = random.nextInt(SIZE);
            col = random.nextInt(SIZE);
        } while (!emptyCell(row,col));
        MAP[row][col] = DOT_0;
        printMap();
    }

    private static boolean hasEmptyCell() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (emptyCell(row, col)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean emptyCell(int row, int col) {
        return MAP[row][col] == DOT_EMPTY;
    }

    private static int readIndex() {
        while (!scanner.hasNextInt()) {
            System.out.println("Введенное значение должно быть числом!");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static boolean assertInput(int number) {
        return number < 0 || number > SIZE;
    }


    private static void printMap() {
        printHeader();
        printMapState();
        System.out.println();
    }

    private static void printMapState() {
        for (int row = 0; row < SIZE; row++){
            System.out.print(row + 1 + " ");
            for (int col = 0; col < SIZE; col++) {
                System.out.print(MAP[row][col] + " " );
            }
            System.out.println();
        }
    }

    private static void printHeader() {
        for (int col = 0; col <= SIZE; col++){
            System.out.print(col + " ");
        }
        System.out.println();
    }

    private static char[][] initMap(){
        MAP = new char[SIZE][SIZE];

        for (int col = 0; col < SIZE; col++){
            Arrays.fill(MAP[col], DOT_EMPTY);
        }

        return MAP;
    }
}
