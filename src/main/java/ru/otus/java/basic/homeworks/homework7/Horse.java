package ru.otus.java.basic.homeworks.homework7;

public class Horse implements Moving{
    private int power = 100;

    public Horse(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean moving (Area area, int distance) {
        if (area == Area.SWAMP) {
            System.out.println("Лошадь не может идти по " + area);
            return false;
        }
        if (power >= distance){
            power -= distance;
            System.out.println("Лошадь пробежала " + distance + " км.");
            return true;
        } else {
            System.out.println("Лошадь устала");
            return false;
        }
    }
}
