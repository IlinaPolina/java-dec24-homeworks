package ru.otus.java.basic.homeworks.homework5.Animal;

public class Dog extends Animal {
    public Dog (String name, int speed, int speedSwimmer, int endurance) {
        super(name, speed, speedSwimmer, endurance);
    }

    @Override
    public void swim(int distance) {
        int remains = endurance - distance*2;
        float time = (float) distance /speed;
        if (distance*2 > endurance) {
            System.out.println("У животного появилось состояние усталости");
            System.out.println("Время в пути: -1");
        }
        else {
            System.out.println("Животное проплыло: " + distance + " м., остаток выносливости: " + remains);
            System.out.println("Время в пути: " + time + " сек.");
        }
    }
}
