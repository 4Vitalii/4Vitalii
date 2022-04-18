package com.javacourse;


import java.util.Random;

public class Main {


    public static void main(String[] args) {
        integerArray();
        fillArray();
        fillArray2();
        fillDiagonal();
        maxMin();
    }

    public static void integerArray() {
        /**
         * 1.	Задать целочисленный массив, состоящий из элементов 0 и 1.
         * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        */
        System.out.println("task1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;

            } else {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
    }

    public static void fillArray() {
        System.out.println("task2");
        /**
         * 2.	Задать пустой целочисленный массив размером 8.
         * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
         */
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
    }

    public static void fillArray2() {
        System.out.println("task3");
        /**
         * 3.	Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом
         * и числа меньшие 6 умножить на 2;
         */
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < 6) {
                array2[i] *= 2;

                System.out.println(array2[i]);
            }

        }
    }

    public static void fillDiagonal() {
        System.out.println("task4");
        /**
         * 4.	Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
         * если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
         * то есть [0][0], [1][1], [2][2], …, [n][n];
         */
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][i] = 1;
                arr[arr.length - j - 1][j] = 1;
                System.out.print(arr[i][j] + " ");

            }
            System.out.println("\n");
        }

    }
    public static void maxMin(){
        System.out.println("task5");
        /**
         * Задать одномерный массив и найти в нем минимальный
         * и максимальный элементы (без помощи интернета);
         */
        int [] arr = new int [10];
        Random rnd = new Random();
        for (int i = 0 ; i < arr.length; i++){
            arr [i] = rnd.nextInt(10);
            System.out.println(arr[i] + " ");

        }
        int min = arr [0];
        int max = arr [0];
        for (int i = 0; i< arr.length;i++){
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]){
                    max = arr[i];
                }
        }
        System.out.println();
        System.out.println("Min is" + " " + min);
        System.out.println();
        System.out.println("Max is" + " " + max);


    }
}








