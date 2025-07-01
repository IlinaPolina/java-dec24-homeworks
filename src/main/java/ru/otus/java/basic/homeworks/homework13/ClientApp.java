package ru.otus.java.basic.homeworks.homework13;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
        public static void main(String[] args) throws IOException {
            try (Socket socket = new Socket("localhost", 1234)) {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                Scanner scanner = new Scanner(System.in);

                String serverMessage = in.readLine();
                System.out.println("Сервер: " + serverMessage);

                System.out.println("Введите выражение (например: 5 + 2): ");
                String input = scanner.nextLine();

                out.write(input);
                out.newLine();
                out.flush();

                String result = in.readLine();
                System.out.println("Сервер вернул: " + result);
            }
        }
    }
