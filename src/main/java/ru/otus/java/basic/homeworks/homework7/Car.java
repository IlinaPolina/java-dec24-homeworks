package ru.otus.java.basic.homeworks.homework7;

public class Car implements Moving {
    private int fuel = 50;

    public boolean moving (Area area, int distance) {
        if (area == Area.FOREST || area == Area.SWAMP) {
            System.out.println("Машина не может ехать по " + area);
            return false;
        }
        if(fuel >= distance) {
            fuel -= distance;
            System.out.println("Машина проехала " + distance + " км.");
            return true;
        } else {
            System.out.println("Не хватает бензина.");
            return false;
        }
    }
}
