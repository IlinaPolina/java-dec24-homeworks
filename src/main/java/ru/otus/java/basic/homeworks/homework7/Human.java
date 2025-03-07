package ru.otus.java.basic.homeworks.homework7;

public class Human {
    private String name;
    private Moving currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sitOnTransport(Moving transport) {
        this.currentTransport = transport;
        System.out.println(name + " сел на " + transport);
    }

    public void getOffTransport() {
        System.out.println(name + " слез с транспорта.");
        this.currentTransport = null;
    }

    public boolean move (Area area, int distance) {
        if (currentTransport != null ) {
            return currentTransport.moving(area, distance);
        } else {
            System.out.println(name + " прошел пешком" + distance + " км.");
            return true;
        }
    }
}