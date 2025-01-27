package ru.otus.java.basic.homeworks.homework2;

import java.util.Arrays;

public class AppHW2 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int counter = 0;
        while (counter < 5) {
            System.out.println("Печать строки n раз");
            counter++;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Печать строки i раз");
        }
        System.out.println("Задание 2");
        sumArr(new int[]{6, 8, 9, 7, 6, 4, 3, 1, 2, 6});
        System.out.println("Задание 3");
        arrNumbers(new int[]{2, 2, 2, 2, 2}, 9);
        System.out.println("Задание 4");
        arrPlus(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 7);
        System.out.println("Задание 5");
        arrPastSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

    }

    public static void sumArr(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);

    }

    public static void arrNumbers(int arr[], int number) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arrPlus(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += number;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arrPastSum(int[] arr) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                sumLeft += arr[i];
            } else {
                sumRight += arr[i];
            }
        }
        if (sumLeft > sumRight) {
            System.out.println("Сумма больше половины:" + " " + sumLeft + " - " + "Суммa первой половины");
        } else {
            System.out.println("Сумма больше половины:" + " " + sumRight + " - " + "Суммa второй половины");
        }

    }
}
