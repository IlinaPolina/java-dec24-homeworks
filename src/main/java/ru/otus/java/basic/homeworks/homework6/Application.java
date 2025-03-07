package ru.otus.java.basic.homeworks.homework6;

public class Application {
    public static void main(String[] args) {
        Plate plate = new Plate(1000,0);
        plate.addFood(1000);
        Cat[] cats = {
                new Cat("Basya", false, 200),
                new Cat("Vasya", true, 300),
                new Cat("Masya", false, 120),
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
