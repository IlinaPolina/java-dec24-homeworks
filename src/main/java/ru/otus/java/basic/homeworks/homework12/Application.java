package ru.otus.java.basic.homeworks.homework12;

import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        File folder = new File(".");
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        System.out.println("Список текстовых файлов:");
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Нет файлов");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла с которым хотите поработать");
        String fileName = scanner.nextLine();
        File selectedFile = new File(fileName);
        System.out.println("Содержимое файла");
        try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
        System.out.println("Теперь можете вводить строки для записи в файл. Для выхода напишите 'exit':");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile, true))) { // true = дозапись
            String input;
            while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
                writer.write(input);
                writer.newLine(); // переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        System.out.println("Работа с файлом завершена.");
    }
}
