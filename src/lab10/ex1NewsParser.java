package lab10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ex1NewsParser {

    public static void main(String[] args) {
        try {
            String url = "https://gtrk-kostroma.ru/";
            System.out.println("Подключаюсь к " + url);
            Document doc = Jsoup.connect(url).get();
            System.out.println("Подключение успешно!");

            // Ищем элементы новостей
            Elements newsItems = doc.select("div.news.news--lenta");

            // Проходим по каждой новости
            for (Element newsItem : newsItems) {
                // Ищем заголовок
                Element titleElement = newsItem.selectFirst("a"); // Просто ищем первый <a> внутри новости
                String title = (titleElement != null) ? titleElement.text() : "Заголовок не найден";

                // Выводим заголовок
                System.out.println("Заголовок: " + title);
                System.out.println();
            }

        } catch (IOException e) {
            System.err.println("Ошибка при подключении к сайту или парсинге: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Непредвиденная ошибка: " + e.getMessage());
        }
    }

}
