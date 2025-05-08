package lab8;

//C:\\My\\stih.txt

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class example2 {

    private static final Set<String> WRITERS = new HashSet<>(Arrays.asList(
            "Пушкин", "Лермонтов", "Толстой", "Достоевский", "Чехов", "Гоголь", "Тургенев", "Есенин",
            "Блок", "Ахматова", "Цветаева", "Булгаков", "Шолохов", "Пастернак", "Бродский", "Маяковский"));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя исходного файла: ");
        String inputFileName = scanner.nextLine();

        System.out.print("Введите имя результирующего файла: ");
        String outputFileName = scanner.nextLine();

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(inputFileName), "UTF-8"));

            writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(outputFileName), "UTF-8"));

            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("\\s+");
                List<String> writerWords = new ArrayList<>();

                for (String word : words) {
                    if (!word.isEmpty()) {
                        String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                        if (WRITERS.contains(capitalizedWord)) {
                            writerWords.add(capitalizedWord);
                        }
                    }
                }

                if (!writerWords.isEmpty()) {
                    writer.write("Строка " + lineNumber + ": " + String.join(", ", writerWords));
                    writer.newLine();
                    writer.write("Количество фамилий писателей и поэтов: " + writerWords.size());
                    writer.newLine();
                }
            }

            System.out.println("Обработка завершена. Результат записан в файл: " + outputFileName);

        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: Файл не найден: " + inputFileName);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении/записи файла: " + e.getMessage());
        } finally {
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