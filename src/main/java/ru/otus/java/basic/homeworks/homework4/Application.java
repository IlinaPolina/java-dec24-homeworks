package ru.otus.java.basic.homeworks.homework4;

public class Application {
    public static void main(String[] args) {
        User[] users = {
                new User("Ivan", "Ivanov", "Ivanovich", 1988, "ivanov@mail.ru"),
                new User("Oleg", "Petrov", "Ganibalovich", 1955, "petrov@mail.ru"),
                new User("Alex", "Belij", "Sergeevich", 1967, "1967@mail.ru"),
                new User("Dmitriy", "Chernij", "Sergeevich", 1934, "che34@mail.ru"),
                new User("Fedor", "Shaljpin", "Ivanovich", 1999, "fed99@mail.ru"),
                new User("Olga", "Turbina", "Denisovna", 1997, "olgaturbina@mail.ru"),
                new User("Igor", "Kosolopav", "Hrenovich", 1945, "kosoj@mail.ru"),
                new User("Eva", "Ilina", "Vladimirovna", 1910, "evailina@mail.ru"),
                new User("Elena", "Hudjkova", "Olegovna", 1998, "hudj1998@mail.ru"),
                new User("Mascha", "Yakimenko", "Aleksandrovna", 1990, "mashsyakk@mail.ru")
        };
        for (int i = 0; i < users.length; i++) {
            users[i].year();
        }

        Box box1 = new Box("red", 10, true);
        box1.infoBox();
        boolean object = true;
        String objectName = "ball";
        if (box1.openBox()){
            if (object == true) {
                System.out.println("В коробке есть предмет: " + objectName + ", можно его выкинуть и положить другой");
            } else {
                System.out.println("В коробке нет предмета, можно положить " + objectName);
            }
        } else {
            box1.closeBox();
        }
    }
}