package ru.otus.java.basic.homeworks.homework4;

public class Box {
    private String color;
    private int size;
    private boolean condition;
    private String item;

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public boolean isCondition() {
        return condition;
    }

    public String getItem() {
        return item;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Box(String color, int size, boolean condition) {
        this.color = color;
        this.size = size;
        this.condition = condition;
        this.item = item;
    }
    public void infoBox () {
        System.out.println(color + " " + size + " " + condition + " " + item);
    }
}
