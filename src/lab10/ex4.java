package lab10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.net.SocketTimeoutException;

public class ex4 {

    private static final String URL = "https://lenta.ru/parts/news/";
    private static final String OUTPUT_FILE = "news_lenta.txt";
    private static final int MAX_RETRY_ATTEMPTS = 3;

    public static void main(String[] args) {
        try {
            parseAndSaveNews();
        } catch (IOException e) {
            System.err.println("Фатальная ошибка при работе с файлом: " + e.getMessage());
        }
    }

    private static void parseAndSaveNews() throws IOException {
        for (int attempt = 1; attempt <= MAX_RETRY_ATTEMPTS; attempt++) {
            try {
                System.out.println("Подключаюсь к " + URL + ". Попытка " + attempt);
                Document doc = Jsoup.connect(URL).timeout(10000).get();
                System.out.println("Подключение успешно!");

                Elements newsItems = doc.select("li.parts-page__item");

                try (FileWriter writer = new FileWriter(OUTPUT_FILE)) {
                    for (Element newsItem : newsItems) {
                        Element titleElement = newsItem.selectFirst("h3.card-full-news__title");
                        String title = (titleElement != null) ? titleElement.text() : "Заголовок не найден";

                        String newsText = "Заголовок: " + title + "\n";
                        System.out.println(newsText);
                        writer.write(newsText);
                    }
                    System.out.println("Новости успешно сохранены в файл: " + OUTPUT_FILE);

                }

                return;

            } catch (IOException e) {
                System.err.println("Ошибка при подключении к сайту или парсинге (попытка " + attempt + "): " + e.getMessage());
                if (e instanceof SocketTimeoutException) {
                    System.err.println("Превышено время ожидания при подключении. Попробуем еще раз.");
                } else {
                    System.err.println("Возможно, проблема с сайтом или сетью. Попробуем еще раз.");
                }

                if (attempt == MAX_RETRY_ATTEMPTS) {
                    System.err.println("Превышено максимальное количество попыток. Завершение работы.");
                    throw e;
                }

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignored) {
                }
            }
        }
    }
}
