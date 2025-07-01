package ru.otus.java.basic.homeworks.homework13;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
        public static void main(String[] args) throws IOException {
            ServerSocket serverSocket = new ServerSocket(1234); // Порт для подключения
            System.out.println("Сервер запущен. Ожидаем клиента...");

            try (Socket clientSocket = serverSocket.accept()) {
                System.out.println("Клиент подключился!");

                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                out.write("Выберите операцию: +, -, *, /");
                out.newLine();
                out.flush();

                String input = in.readLine();
                System.out.println("Получено от клиента: " + input);

                String[] parts = input.split(" ");
                double result;
                try {
                    double num1 = Double.parseDouble(parts[0]);
                    String operator = parts[1];
                    double num2 = Double.parseDouble(parts[2]);

                    switch (operator) {
                        case "+" -> result = num1 + num2;
                        case "-" -> result = num1 - num2;
                        case "*" -> result = num1 * num2;
                        case "/" -> {
                            if (num2 == 0) {
                                out.write("Ошибка: деление на ноль");
                                out.newLine();
                                out.flush();
                                return;
                            }
                            result = num1 / num2;
                        }
                        default -> {
                            out.write("Ошибка: неизвестная операция");
                            out.newLine();
                            out.flush();
                            return;
                        }
                    }

                    out.write("Результат: " + result);
                    out.newLine();
                    out.flush();

                } catch (Exception e) {
                    out.write("Ошибка обработки данных");
                    out.newLine();
                    out.flush();
                }
            }
        }
    }

