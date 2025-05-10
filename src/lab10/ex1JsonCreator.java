package lab10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class ex1JsonCreator {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("title", "����� � ���");
        book1.put("author", "��� �������");
        book1.put("year", 1869);

        JSONObject book2 = new JSONObject();
        book2.put("title", "������ � ���������");
        book2.put("author", "������ ��������");
        book2.put("year", 1967);

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try (FileWriter file = new FileWriter("D:\\java\\java\\src\\lab10\\ex1JsonCreator.json")) {
            file.write(library.toJSONString());
            System.out.println("Json ���� ������� ������!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
