package ru.otus.java.basic.homeworks.homework6;

public class Application {
    public static void main(String[] args) {
        Plate plate = new Plate(500,0);
        plate.addFood(1000);
        Cat[] cats = {
                new Cat("Basya", true, 200),
                new Cat("Vasya", true, 300),
                new Cat("Masya", true, 120),
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        System.out.println(plate);
    }
}
