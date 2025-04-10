package ru.otus.java.basic.homeworks.homework11;

public class Application {
    public static void main(String[] args) {
        PersonDataBase db = new PersonDataBase();
        db.add(new Person("Igor", 2L, Position.MANAGER));
        db.add(new Person("Lena", 3L, Position.DRIVER));
        db.add(new Person("Kirill", 4L, Position.BRANCH_DIRECTOR));

        System.out.println("Игорь — сотрудник? " + db.isEmployee(2L));
        System.out.println("Лена — менеджер? " + db.isManager(db.findById(3L)));

        int[] arr = {5, 2, 9, 1, 3};
        Sort.bubbleSort(arr); // или quickSort(arr, 0, arr.length - 1)
        System.out.println("Отсортировано:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
