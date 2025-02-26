package ru.otus.java.basic.homeworks.homework4;

public class User {
    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String surname;
    private String name;
    private String patronymic;
    private int year;
    private String email;

    public User(String surname, String name, String patronymic, int year, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.year = year;
        this.email = email;
    }

    public void info () {
        System.out.println("ФИО:" + " "  + surname + " " + name + " " + patronymic);
        System.out.println("Год рождения:" + " " + year );
        System.out.println("Email:" + " "+ email);
    }

    public void year () {
        if (year < 1984) {
            System.out.println("ФИО:" + " "  + surname + " " + name + " " + patronymic);
            System.out.println("Год рождения:" + " " + year );
            System.out.println("Email:" + " "+ email);
        }
    }
}