package lab8;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя исходного файла: ");
        String inputFileName = scanner.nextLine();

        System.out.print("Введите имя результирующего файла: ");
        String outputFileName = scanner.nextLine();

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            // 1. Чтение из исходного файла
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(inputFileName), "UTF-8"));

            String firstLine = reader.readLine(); // Пропускаем первую строку
            String secondLine = reader.readLine();
            String numbersLine = reader.readLine();
            ArrayList<Double> positiveNumbers = new ArrayList<>();

            if (numbersLine != null) {
                String[] numberStrings = numbersLine.split("\\s+"); // Разделяем строку на числа (разделитель - один или более пробелов)
                for (String numberString : numberStrings) {
                    try {
                        double number = Double.parseDouble(numberString);
                        if (number > 0) {
                            positiveNumbers.add(number);
                        }
                    } catch (NumberFormatException e) {
                        // Игнорируем нечисловые значения
                    }
                }
            }


            // 2. Запись в результирующий файл
            writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(outputFileName), "UTF-8"));

            if (secondLine != null) {
                writer.write(secondLine);
                writer.newLine();
            }

            for (Double number : positiveNumbers) {
                writer.write(number.toString());
                writer.newLine();
            }
            System.out.println("Обработка завершена. Результат записан в файл: " + outputFileName);

        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: Файл не найден: " + inputFileName);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении/записи файла: " + e.getMessage());
        } finally {
            // 3. Закрытие файлов
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("Ошибка при закрытии файлов: " + e.getMessage());
            }
        }
    }
}