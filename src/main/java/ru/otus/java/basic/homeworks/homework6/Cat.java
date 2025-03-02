package ru.otus.java.basic.homeworks.homework6;

public class Cat {
    String name;
    boolean hungry;

    public Cat(String name,boolean hungry) {
        this.name = name;
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }


    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
    public void eat (Plate plate) {
        if (hungry) {
            plate.eatFood (350);
            System.out.println(name + " поел");
            hungry = false;
        }
        else {
            System.out.println(name + " сыт");
        }
    }
}
