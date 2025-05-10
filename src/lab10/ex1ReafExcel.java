package lab10;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ex1ReafExcel {
    public static void main(String[] args) throws IOException {
        // ��������� ���� Excel ��� ������
        String filePath = "D:\\java\\java\\src\\lab10\\ex1WriteExcel.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        // ������� ��������� ����� Excel �� �����
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        // �������� ���� �� ����� �� ��� �����
        XSSFSheet sheet = workbook.getSheet("������");

        // ���������� ������ � ������ �����
        for (Row row : sheet) {
            for (Cell cell : row) {
                // ������� �������� ������ �� �����
                System.out.println(cell.toString() + "\t");
            }
            System.out.println();
        }

        // ��������� ���� � ����������� �������
        workbook.close();
        inputStream.close();
    }
}
