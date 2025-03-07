package ru.otus.java.basic.homeworks.homework5.Animal;

public abstract class Animal {
    String name;
    int speed;
    int speedSwimmer;
    int endurance;

    public Animal(String name, int speed, int speedSwimmer, int endurance) {
        this.name = name;
        this.speed = speed;
        this.speedSwimmer = speedSwimmer;
        this.endurance = endurance;
    }

    public int getSpeedSwimmer() {
        return speedSwimmer;
    }

    public void setSpeedSwimmer(int speedSwimmer) {
        this.speedSwimmer = speedSwimmer;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
    public Animal() {
        System.out.println();
    }
    public void info () {
        System.out.println("Name: "+ name + " " + "Speed: "+ speed + " " + "SpeedSwimmer: " + speedSwimmer + " " + "endurance: " + endurance);
    }

    public void run (int distance) {
        int remains = endurance - distance;
        float time = (float) distance /speed;
        if (distance > endurance) {
            System.out.println("У животного появилось состояние усталости");
            System.out.println("Время в пути: -1");
        }
        else {
            System.out.println("Животное пробежало: " + distance + " м., остаток выносливости: " + remains);
            System.out.println("Время в пути: " + time + " сек.");
        }
    }
    public abstract void swim(int distance);

}
