package com.lessons.hw;

import java.util.Arrays;

import static java.lang.Math.abs;

public class Lesson3Hw {
    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] firstArray = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == 1) {
                firstArray[i] = 0;
            }
            else {
                firstArray[i] = 1;
            }
        }

        //Проверка
        System.out.println(Arrays.toString(firstArray));

        //2. Задать пустой целочисленный массив длиной 100.
        // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

        int[] secondArray= new int [100];
        for (int i = 0; i < secondArray.length; i++){
            secondArray[i]= i+1;
        }

        //Проверка
        System.out.println(Arrays.toString(secondArray));

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] thirdArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < thirdArray.length; i++){
            if (thirdArray[i]<6){
                thirdArray[i]*=2;
            }
        }

        //Проверка
        System.out.println(Arrays.toString(thirdArray));

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        // если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];


        int size = 5;
        int[][] foursArray = new int[size][size];

        for (int i = 0; i < foursArray.length; i++) {
            for (int j = 0; j < foursArray.length; j++) {
                if (i==j) {
                    foursArray[i][j] = 1;
                }
                if (j==size-1) {
                    foursArray[i][j] = 1;
                    size--;
                }
            }
        }

        // Проверка
        for (int i = 0; i < foursArray.length; i++) {
            for (int j = 0; j < foursArray.length; j++) {
                System.out.print(foursArray[i][j] + " ");
            }
            System.out.println();
        }

        //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        int len = 5;
        int initialValue= 66;
        System.out.println(Arrays.toString(createFifthArray(len, initialValue)));

        //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        int [] sixthArray = {2, 4, 22, -45, 0, -3, 132, 88, 0};
        Arrays.sort (sixthArray);
        System.out.println("Min value = " + sixthArray[0] + ", Max value = " + sixthArray[sixthArray.length - 1]);

        //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        //**Примеры:
        //checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
        //checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
        //граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

        int [] seventhArray = {1, 8, 4, 5, 8, 10};
        System.out.println(compareArraySide(seventhArray));

        //8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        // или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
        // Элементы смещаются циклично.
        // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
        // при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
        System.out.println("-----------task 8-------------");
        int[] eighthArray = {1, 2, 5, 8};
        int n = 4;

        System.out.println(Arrays.toString(offsetArray(eighthArray,n)));
    }


    private static int[] createFifthArray(int len, int initialValue) {
        int [] fifthArray = new int[len];
        Arrays.fill(fifthArray,initialValue);
        return fifthArray;
    }

    private static boolean compareArraySide (int [] seventhArray) {
        int sum1 = 0;
        for (int i = 0; i < seventhArray.length-1; i++){
            int sum2 = 0;
            sum1 += seventhArray[i];

            for (int j = i+1; j < seventhArray.length; j++){
                sum2+=seventhArray[j];
            }

            if (sum1 == sum2) {
                return true;
            }
        }
        return false;
    }

   private static int[] offsetArray (int[] eighthArray, int offset) {

       int [] eighthArray1; /// реализовал через доп массив

       if (offset > 0) {
           eighthArray1 = Arrays.copyOf(Arrays.copyOfRange(eighthArray, eighthArray.length-offset, eighthArray.length), eighthArray.length);
           for (int i = offset; i < eighthArray.length; i++) {
               eighthArray1[i] = eighthArray[i - offset];
           }
       }
       else {
           eighthArray1 = Arrays.copyOf(Arrays.copyOfRange(eighthArray, abs(offset), eighthArray.length), eighthArray.length);
           for (int i = eighthArray.length + offset; i < eighthArray.length; i++) {
               eighthArray1[i] = eighthArray[abs(eighthArray.length-i+offset)];
           }
       }
       return eighthArray1;
   }
}