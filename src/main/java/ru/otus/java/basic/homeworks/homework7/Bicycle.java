package ru.otus.java.basic.homeworks.homework7;

public class Bicycle implements Moving{

    @Override
    public boolean moving(Area area, int distance) {
        if (area == Area.SWAMP) {
            System.out.println("Велосипед не может проехать по " + area);
            return false;
        }
        System.out.println("Велосипед проехал " + distance + " км.");
        return true;
    }
}
