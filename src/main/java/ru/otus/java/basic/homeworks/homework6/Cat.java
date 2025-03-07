package ru.otus.java.basic.homeworks.homework6;

public class Cat {
    String name;
    boolean satiety;
    int appetit;

    public Cat(String name,boolean satiety, int appetit) {
        this.name = name;
        this.satiety = satiety;
        this.appetit = appetit;
    }

    public int getAppetit() {
        return appetit;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
    public void eat (Plate plate) {
        if (satiety == false) {
            plate.eatFood (appetit);
            satiety = true;
        }
        else {
            System.out.println(name + " сыт");
            satiety = true;
        }
        if (plate.curAmountFood < appetit) {
            System.out.println(name + " не хватает еды");
            satiety = false;
        }
    }

}
