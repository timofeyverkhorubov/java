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
            System.err.println("��������� ������ ��� ������ � ������: " + e.getMessage());
        }
    }

    private static void parseAndSaveNews() throws IOException {
        for (int attempt = 1; attempt <= MAX_RETRY_ATTEMPTS; attempt++) {
            try {
                System.out.println("����������� � " + URL + ". ������� " + attempt);
                Document doc = Jsoup.connect(URL).timeout(10000).get();
                System.out.println("����������� �������!");

                Elements newsItems = doc.select("li.parts-page__item");

                try (FileWriter writer = new FileWriter(OUTPUT_FILE)) {
                    for (Element newsItem : newsItems) {
                        Element titleElement = newsItem.selectFirst("h3.card-full-news__title");
                        String title = (titleElement != null) ? titleElement.text() : "��������� �� ������";

                        String newsText = "���������: " + title + "\n";
                        System.out.println(newsText);
                        writer.write(newsText);
                    }
                    System.out.println("������� ������� ��������� � ����: " + OUTPUT_FILE);

                }

                return;

            } catch (IOException e) {
                System.err.println("������ ��� ����������� � ����� ��� �������� (������� " + attempt + "): " + e.getMessage());
                if (e instanceof SocketTimeoutException) {
                    System.err.println("��������� ����� �������� ��� �����������. ��������� ��� ���.");
                } else {
                    System.err.println("��������, �������� � ������ ��� �����. ��������� ��� ���.");
                }

                if (attempt == MAX_RETRY_ATTEMPTS) {
                    System.err.println("��������� ������������ ���������� �������. ���������� ������.");
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
