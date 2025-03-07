package ru.otus.java.basic.homeworks.homework7;

public class Application {
    public static void main(String[] args) {
        Human human1 = new Human("Андрей");
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Horse horse = new Horse (90);
        Rover rover = new Rover();

        human1.sitOnTransport(car);
        human1.move(Area.PLAIN, 1020);
        human1.move(Area.SWAMP, 3);
        human1.move(Area.FOREST, 1);
        human1.getOffTransport();
        human1.sitOnTransport(horse);
        human1.move(Area.FOREST,10);
        human1.move(Area.SWAMP,3);
        human1.move(Area.FOREST, 1);
        human1.getOffTransport();
        human1.sitOnTransport(rover);
        human1.move(Area.FOREST,7);
        human1.move(Area.SWAMP,30);
        human1.move(Area.FOREST, 40);
        human1.getOffTransport();
        human1.sitOnTransport(bicycle);
        human1.move(Area.FOREST,7);
        human1.move(Area.SWAMP,30);
        human1.move(Area.FOREST, 40);
    }
}
