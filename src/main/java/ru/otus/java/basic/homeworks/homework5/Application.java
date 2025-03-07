package ru.otus.java.basic.homeworks.homework5;

import ru.otus.java.basic.homeworks.homework5.Animal.Animal;

import ru.otus.java.basic.homeworks.homework5.Animal.Cat;
import ru.otus.java.basic.homeworks.homework5.Animal.Dog;
import ru.otus.java.basic.homeworks.homework5.Animal.Horse;

public class Application {
    public static void main(String[] args) {
        Cat cat = new Cat ("Bass",1,0,100);
        cat.info();
        cat.run(110);
        cat.swim(10);

        Dog dog = new Dog("Funt",3, 1, 200);
        dog.info();
        dog.run(110);
        dog.swim(10);

        Horse horse = new Horse("Igogo", 10, 3,1000);
        horse.info();
        horse.run(110);
        horse.swim(10);
    }
}
