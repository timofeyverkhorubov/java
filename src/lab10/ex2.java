package lab10;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.*;
import java.util.stream.*;

public class ex2 {
    private static final String FILE_PATH = "src/lab10/ex1XmlFile.xml";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Document doc = loadOrCreateDocument();

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
                        addNewBook(doc, scanner);
                        break;
                    case 2:
                        searchByAuthor(doc, scanner);
                        break;
                    case 3:
                        searchByYear(doc, scanner);
                        break;
                    case 4:
                        deleteBookByTitle(doc, scanner);
                        break;
                    case 5:
                        saveDocument(doc);
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


    private static Document loadOrCreateDocument() throws ParserConfigurationException {
        File file = new File(FILE_PATH);
        if (file.exists()) {
            try {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                return dBuilder.parse(file);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("library");
        doc.appendChild(rootElement);
        return doc;
    }

    private static void saveDocument(Document doc) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(FILE_PATH));
        transformer.transform(source, result);
        System.out.println("XML-файл успешно обновлен!");
    }

    private static void addNewBook(Document doc, Scanner scanner) {
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();
        System.out.print("Введите год издания: ");
        String year = scanner.nextLine();

        Element book = doc.createElement("book");
        Element titleElement = doc.createElement("title");
        titleElement.appendChild(doc.createTextNode(title));
        book.appendChild(titleElement);

        Element authorElement = doc.createElement("author");
        authorElement.appendChild(doc.createTextNode(author));
        book.appendChild(authorElement);

        Element yearElement = doc.createElement("year");
        yearElement.appendChild(doc.createTextNode(year));
        book.appendChild(yearElement);

        doc.getDocumentElement().appendChild(book);
        System.out.println("Книга успешно добавлена!");
    }


    private static void searchByAuthor(Document doc, Scanner scanner) {
        System.out.print("Введите автора для поиска: ");
        String author = scanner.nextLine();

        List<Element> foundBooks = nodeListToStream(doc.getElementsByTagName("book"))
                .filter(element -> author.equalsIgnoreCase(
                        element.getElementsByTagName("author").item(0).getTextContent()))
                .collect(Collectors.toList());

        if (foundBooks.isEmpty()) {
            System.out.println("Книги данного автора не найдены.");
        } else {
            System.out.println("Найденные книги:");
            foundBooks.forEach(ex2::printBookInfo);
        }
    }

    private static void searchByYear(Document doc, Scanner scanner) {
        System.out.print("Введите год издания для поиска: ");
        String year = scanner.nextLine();

        List<Element> foundBooks = nodeListToStream(doc.getElementsByTagName("book"))
                .filter(element -> year.equals(
                        element.getElementsByTagName("year").item(0).getTextContent()))
                .collect(Collectors.toList());

        if (foundBooks.isEmpty()) {
            System.out.println("Книги за данный год не найдены.");
        } else {
            System.out.println("Найденные книги:");
            foundBooks.forEach(ex2::printBookInfo);
        }
    }



    private static void deleteBookByTitle(Document doc, Scanner scanner) {
        System.out.print("Введите название книги для удаления: ");
        String title = scanner.nextLine();
        NodeList bookList = doc.getElementsByTagName("book");
        boolean found = false;

        for (int i = 0; i < bookList.getLength(); i++) {
            Element book = (Element) bookList.item(i);
            String bookTitle = book.getElementsByTagName("title").item(0).getTextContent();
            if (bookTitle.equalsIgnoreCase(title)) {
                doc.getDocumentElement().removeChild(book);
                found = true;
                System.out.println("Книга успешно удалена.");
                break;
            }
        }

        if (!found) {
            System.out.println("Книга с таким названием не найдена.");
        }
    }

    private static void printBookInfo(Element book) {
        String title = book.getElementsByTagName("title").item(0).getTextContent();
        String author = book.getElementsByTagName("author").item(0).getTextContent();
        String year = book.getElementsByTagName("year").item(0).getTextContent();
        System.out.printf("Название: %s, Автор: %s, Год: %s%n", title, author, year);
    }
    private static Stream<Element> nodeListToStream(NodeList nodeList) {
        return IntStream.range(0, nodeList.getLength())
                .mapToObj(nodeList::item)
                .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                .map(node -> (Element) node);
    }
}
