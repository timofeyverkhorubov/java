package lab10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class ex3 {
    private static final String FILE_PATH = "D:\\java\\java\\src\\lab10\\ex1JsonCreator.json";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            JSONObject jsonObject = loadOrCreateJSON();
            while (true) {
                System.out.println("\nВыберите действие:");
                System.out.println("1. Добавить новую книгу");
                System.out.println("2. Найти книгу по автору");
                System.out.println("3. Найти книгу по году издания");
                System.out.println("4. Удалить книгу по названию");
                System.out.println("5. Выйти");
                System.out.print("Ваш выбор: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        addNewBook(jsonObject, scanner);
                        break;
                    case 2:
                        searchByAuthor(jsonObject, scanner);
                        break;
                    case 3:
                        searchByYear(jsonObject, scanner);
                        break;
                    case 4:
                        deleteBookByTitle(jsonObject, scanner);
                        break;
                    case 5:
                        saveJSON(jsonObject);
                        System.out.println("Выход из программы.");
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static JSONObject loadOrCreateJSON() {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(FILE_PATH)) {
            return (JSONObject) parser.parse(reader);
        } catch (IOException | ParseException e) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("books", new JSONArray());
            return jsonObject;
        }
    }

    private static void saveJSON(JSONObject jsonObject) {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            writer.write(jsonObject.toJSONString());
            System.out.println("JSON-файл успешно обновлен!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addNewBook(JSONObject jsonObject, Scanner scanner) {
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();
        System.out.print("Введите год издания: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        JSONArray jsonArray = (JSONArray) jsonObject.get("books");
        JSONObject newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("author", author);
        newBook.put("year", year);
        jsonArray.add(newBook);

        System.out.println("Книга успешно добавлена!");
    }

    private static void searchByAuthor(JSONObject jsonObject, Scanner scanner) {
        System.out.print("Введите автора для поиска: ");
        String author = scanner.nextLine();
        JSONArray jsonArray = (JSONArray) jsonObject.get("books");
        for (Object obj : jsonArray) {
            JSONObject book = (JSONObject) obj;
            if (author.equals(book.get("author"))) {
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }
        }
    }

    private static void searchByYear(JSONObject jsonObject, Scanner scanner) {
        System.out.print("Введите год издания для поиска: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        JSONArray jsonArray = (JSONArray) jsonObject.get("books");
        for (Object obj : jsonArray) {
            JSONObject book = (JSONObject) obj;
            if (year == ((Long) book.get("year")).intValue()) {
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }
        }
    }

    private static void deleteBookByTitle(JSONObject jsonObject, Scanner scanner) {
        System.out.print("Введите название книги для удаления: ");
        String title = scanner.nextLine();
        JSONArray jsonArray = (JSONArray) jsonObject.get("books");
        Iterator<JSONObject> iterator = jsonArray.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            JSONObject book = iterator.next();
            if (title.equals(book.get("title"))) {
                iterator.remove();
                found = true;
                System.out.println("Книга успешно удалена.");
                break;
            }
        }
        if (!found) {
            System.out.println("Книга с таким названием не найдена.");
        }
    }
}
