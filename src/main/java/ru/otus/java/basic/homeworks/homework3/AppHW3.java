package ru.otus.java.basic.homeworks.homework3;

public class AppHW3 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        sumOfPositiveElements(new int[][]{{6, 8, 9, 7, 6, 4, 3, 1, 2, 6}, {9, 0, 9, 0, 6, 7, 4, 5, 6}});
        System.out.println();
        System.out.println("Задание 2");
        //squareOfStars();
        squareOfStars2(7, 50);
        System.out.println("Задание 3");
        zeroDiagonals(new int[][]{{1, 1, 1, 1}, {9, 9, 9, 9}, {7, 7, 7, 7}, {3, 3, 3, 3}});
        System.out.println("Задание 4");
        findMax();
    }


    public static void sumOfPositiveElements(int[][] array2d) {
        int sum = 0;
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d.length; j++) {
                if (array2d[i][j] > 0)
                    System.out.print(array2d[i][j]);
            }
        }
    }

    public static void squareOfStars2(int rows, int colons) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colons; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void zeroDiagonals(int[][] array2d) {
        int val = 0;
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (i == j) {
                    array2d[i][j] = val;
                }
                System.out.printf("%4d",array2d[i][j]);
            }
            System.out.println();
        }
    }

    public static void findMax(int[][] array) {
        int val = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > array.length) ;
                val++;
            }
        }
    }
}
