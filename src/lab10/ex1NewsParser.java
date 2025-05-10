package lab10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ex1NewsParser {

    public static void main(String[] args) {
        try {
            String url = "https://www.kostroma.kp.ru/?ysclid=mahvynviwk943949656";
            System.out.println("����������� � " + url);
            Document doc = Jsoup.connect(url).get();
            System.out.println("����������� �������!");

            // ���� �������� ��������
            Elements newsItems = doc.select("div.sc-1tputnk-0.bbyOTY");

            // �������� �� ������ �������
            for (Element newsItem : newsItems) {
                // ���� ���������
                Element titleElement = newsItem.selectFirst("a.sc-1tputnk-2.bOJkdP");
                String title = (titleElement != null) ? titleElement.text() : "��������� �� ������";

                // ������� ���������
                System.out.println("���������: " + title);
                System.out.println();
            }

        } catch (IOException e) {
            System.err.println("������ ��� ����������� � ����� ��� ��������: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("�������������� ������: " + e.getMessage());
        }
    }
}
