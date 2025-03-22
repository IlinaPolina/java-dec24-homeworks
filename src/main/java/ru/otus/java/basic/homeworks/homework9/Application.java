package ru.otus.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.Arrays;


public class Application {
    public static void main(String[] args) {
        minMax(5, 20);
        sumNumber(new int[]{9, 6, 4, 5});
        numberLink(3, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        numberPlus(6, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Сергей", 23 ));
        employees.add(new Employee("Иван", 21 ));
        employees.add(new Employee("Мария", 37 ));
        staffListName(employees);
        staffListAge(employees,35);
        staffListMinAge(employees,25);
        yongStaff(employees);

    }

    private static void minMax(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        int x = 0;
        for (int i = min; i < max; i++) {
            list.add(i + 1);
        }
        System.out.println(list);
    }

    private static void sumNumber(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        list.ensureCapacity(arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    private static void numberLink(int a, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, a);
        }
        System.out.println(list);
    }

    private static void numberPlus(int a, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)+ a);
        }
        System.out.println(list);
    }

    private static void staffListName(ArrayList <Employee> employees) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            names.add(employees.get(i).getName());
        }
        System.out.println(names);
    }

    private static void staffListAge(ArrayList <Employee> employees, int a) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        for (int i = 0; i < employees.size(); i++) {
            names.add(employees.get(i).getName());
        }
        System.out.println(names);

        for (int i = 0; i < employees.size(); i++) {
            ages.add(employees.get(i).getAge());
            if (ages.get(i) < a){
                System.out.println(ages);
            }
        }
    }
    private static void staffListMinAge(ArrayList <Employee> employees, int a) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        for (int i = 0; i < employees.size(); i++) {
            names.add(employees.get(i).getName());
        }
        System.out.println(names);
        int sum = 0;
        for (int i = 0; i < employees.size(); i++) {
            ages.add(employees.get(i).getAge());
            sum += ages.get(i)/employees.size();
            if (sum < a){
                System.out.println("Минимальный средний возраст превышен");
            }
            System.out.println("Минимальный средний возраст не превышен");
        }
    }

    private static void yongStaff(ArrayList <Employee> employees) {
        Employee youngest = employees.get(0);
        for (int i = 1; i < employees.size(); i++) {
            if (employees.get(i).getAge() < youngest.getAge()) {
                youngest = employees.get(i);
            }
        }
        System.out.println("Самый молодой сотрудник: " + youngest);
    }
}
