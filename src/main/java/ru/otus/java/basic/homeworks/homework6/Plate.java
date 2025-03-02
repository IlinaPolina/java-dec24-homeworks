package ru.otus.java.basic.homeworks.homework6;

public class Plate {
    int maxAmountFood;
    int curAmountFood;

    public Plate(int maxAmountFood, int curAmountFood) {
        this.maxAmountFood = maxAmountFood;
        this.curAmountFood = curAmountFood;
    }

    public int getMaxAmountFood() {
        return maxAmountFood;
    }

    public void setMaxAmountFood(int maxAmountFood) {
        this.maxAmountFood = maxAmountFood;
    }

    public int getCurAmountFood() {
        return curAmountFood;
    }

    public void setCurAmountFood(int curAmountFood) {
        this.curAmountFood = curAmountFood;
    }

    public void info() {
        System.out.println();
    }
    public void quantity(int quantity) {
        if (quantity <= maxAmountFood) {
            System.out.println("Тарелка полная еды, еды: " + quantity + " гр.");
        } else {
            System.out.println("Тарелка переполнена");
        }
    }

    public void plusEat (boolean condition) {
        if (condition == true) {
            curAmountFood += 10;
            System.out.println("Тарелка пополнилась на 10 грамм еды.");
            System.out.println("Текущее количество еды: " + curAmountFood);
        }
        else {
            System.out.println("Текущее количество еды: " + curAmountFood);
        }
    }
    public void minusEat(boolean condition) {
        if (condition == true) {
            curAmountFood -= 10;
            System.out.println("Тарелка уменьшилась на 10 грамм еды.");
            System.out.println("Текущее количество еды: " + curAmountFood);
        }
        else {
            System.out.println("Текущее количество еды: " + curAmountFood);
        }
    }
    public void takeFood (int amount) {
        curAmountFood += amount;
        if (curAmountFood > maxAmountFood) {
            System.out.println("Тарелка переполнилась, количество еды: " + maxAmountFood);
            curAmountFood = maxAmountFood;
            System.out.println("Текущее количество еды в тарелке: " + curAmountFood);
        }
        else {
            System.out.println("Тарелка пополнилась на " + amount + " гр. еды");
            System.out.println("Текущее количество еды в тарелке: " + curAmountFood);
        }
    }

    public void eatFood (int amount1) {
        curAmountFood -= amount1;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "maximumAmountOfFood=" + maxAmountFood +
                ", currentAmountOfFood=" + curAmountFood +
                '}';
    }
}
