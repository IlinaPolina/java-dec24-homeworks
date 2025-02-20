package ru.otus.java.basic.homeworks.homework1;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("1 задание:");
        greetings();
        System.out.println("2 задание:");
        checkSign();
        System.out.println("3 задание:");
        selectColor(21);
        System.out.println("4 задание:");
        compareNumbers(89, 78);
        System.out.println("5 задание:");
        addOrSubtractAndPrint(3, 4, true);
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign() {
        int a = -5;
        int b = 6;
        int c = 7;
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Cумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data > 10 && data < 20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            int resul = initValue + delta;
            System.out.println("результат:" + resul);
        } else {
            int resul = initValue - delta;
            System.out.println("результат:" + resul);
        }
    }
}
