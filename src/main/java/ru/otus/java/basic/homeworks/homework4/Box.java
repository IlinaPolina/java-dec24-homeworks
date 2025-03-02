package ru.otus.java.basic.homeworks.homework4;

public class Box {
    private String color;
    private int size;

    public Box(String color, int size, boolean condition) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    public void infoBox () {
        System.out.println(color + " " + size);
    }

    public boolean openBox() {
        System.out.println("Коробка открыта");
        return true;
    }
    public boolean closeBox() {
        System.out.println("Коробка закрыта");
        return false;
    }
}
