package ru.otus.java.basic.homeworks.homework8;

public class Application {
    public static void main(String[] args) {
        // Корректный массив 4x4
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Массив неправильного размера (3x4)
        String[][] wrongSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        // Массив с ошибкой в данных (X вместо числа)
        String[][] wrongDataArray = {
                {"1", "2", "3", "4"},
                {"5", "X", "7", "8"},  // ❌ Ошибка тут
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        testArray(correctArray);
        testArray(wrongSizeArray);
        testArray(wrongDataArray);
    }

    public static void testArray(String[][] array) {
        try {
            int sum = sumArr(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int sumArr(String[][] array2d) {
        if (array2d.length != 4) {
            throw new AppArraySizeException("Массив должен быть размером 4x4. Фактический размер: " + array2d.length + "x" + array2d[0].length);
        }
        for (int i = 0; i < array2d.length; i++) {
            if (array2d[i].length != 4) {
                throw new AppArraySizeException("В строке " + i + " неверное количество столбцов: " + array2d[i].length);
            }
        }
        int sum = 0;
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                try {
                    sum += Integer.parseInt(array2d[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Ошибка в ячейке [" + i + "][" + j + "]: '" + array2d[i][j] + "' не является числом");
                }
            }
        }
        return sum;
    }
}
