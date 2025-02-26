package ru.otus.java.basic.homeworks.homework5.Animal;

public class Cat extends Animal {
    public Cat(String name, int speed, int speedSwimmer, int endurance) {
        super(name, speed, speedSwimmer, endurance);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }
}