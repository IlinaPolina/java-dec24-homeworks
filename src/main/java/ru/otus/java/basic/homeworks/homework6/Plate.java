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

    public void addFood(int amount) {
        curAmountFood += amount;
        if (curAmountFood > maxAmountFood) {
            System.out.println("Тарелка переполнилась, количество еды: " + maxAmountFood);
            curAmountFood = maxAmountFood;
            System.out.println("Текущее количество еды в тарелке: " + curAmountFood);
        }
        else {
            System.out.println("Тарелка пополнилась на " + amount);
            System.out.println("Текущее количество еды в тарелке: " + curAmountFood);
        }
    }

    public boolean eatFood (int appetit) {
        if(curAmountFood >= 0 && curAmountFood >= appetit) {
            System.out.println("Количество еды уменьшилось на " + appetit);
            curAmountFood -= appetit;
            System.out.println("Текущее кол-во еды в тарелке: " + curAmountFood);
            return true;
        } else {
            System.out.println("Еды нет");
            return false;
        }
    }
    @Override
    public String toString() {
        return "Plate{" +
                "maximumAmountOfFood=" + maxAmountFood +
                ", currentAmountOfFood=" + curAmountFood +
                '}';
    }
}
