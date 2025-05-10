package lab10;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ex5 {
    public static void main(String[] args) {
        String filePath = "D:\\java\\java\\src\\lab10\\ex1WriteExcel.xlsx";
        FileInputStream inputStream = null;
        XSSFWorkbook workbook = null;

        try {
            // Открываем файл Excel для чтения
            inputStream = new FileInputStream(filePath);

            // Создаем экземпляр книги Excel из файла
            workbook = new XSSFWorkbook(inputStream);

            // Получаем лист из книги по его имени
            XSSFSheet sheet = workbook.getSheet("Товары");

            if (sheet == null) {
                System.err.println("Лист с именем 'Товары' не найден в файле.");
                return; // Завершаем программу, если лист не найден
            }

            // Перебираем строки и ячейки листа
            for (Row row : sheet) {
                if (row == null) continue; // Пропускаем пустые строки

                for (Cell cell : row) {
                    if (cell == null) {
                        System.out.print("<пусто>\t"); // Выводим "<пусто>", если ячейка пустая
                    } else {
                        System.out.print(cell.toString() + "\t");
                    }
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            System.err.println("Убедитесь, что файл существует и не поврежден, и путь к файлу указан верно.");

        } catch (Exception e) {
            System.err.println("Непредвиденная ошибка: " + e.getMessage());

        } finally {
            // Закрываем файл и освобождаем ресурсы в блоке finally
            try {
                if (workbook != null) workbook.close();
                if (inputStream != null) inputStream.close();
            } catch (IOException ex) {
                System.err.println("Ошибка при закрытии файла: " + ex.getMessage());
            }
        }
    }
}
