package ru.otus.java.basic.homeworks.homework7;

public class Rover implements Moving {
    private int fuel = 100;

    @Override
    public boolean moving(Area area, int distance) {
        if (fuel >= distance) {
            fuel -= distance;
            System.out.println("Вездеход проехал " + distance + "км по" + area);
            return true;
        } else {
            System.out.println("Не хвататет топлива");
            return false;
        }
    }
}
