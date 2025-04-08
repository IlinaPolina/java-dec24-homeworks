package ru.otus.java.basic.homeworks.homework10;

public class Application {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("Ivanov Ivan", "1234567890");
        book.add("Maria Magdalina", "0987654321");
        book.add("Fedor Magregor", "777-000-333");
        book.add(null, null);


        System.out.println(book.find("Ivanov Ivan"));
        System.out.println(book.find("Sidorov"));

        System.out.println(book.containsPhoneNumber("0987654321"));
        System.out.println(book.containsPhoneNumber("0000000000"));

    }
}
