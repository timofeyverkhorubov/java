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
            // ��������� ���� Excel ��� ������
            inputStream = new FileInputStream(filePath);

            // ������� ��������� ����� Excel �� �����
            workbook = new XSSFWorkbook(inputStream);

            // �������� ���� �� ����� �� ��� �����
            XSSFSheet sheet = workbook.getSheet("������");

            if (sheet == null) {
                System.err.println("���� � ������ '������' �� ������ � �����.");
                return; // ��������� ���������, ���� ���� �� ������
            }

            // ���������� ������ � ������ �����
            for (Row row : sheet) {
                if (row == null) continue; // ���������� ������ ������

                for (Cell cell : row) {
                    if (cell == null) {
                        System.out.print("<�����>\t"); // ������� "<�����>", ���� ������ ������
                    } else {
                        System.out.print(cell.toString() + "\t");
                    }
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.err.println("������ ��� ������ �����: " + e.getMessage());
            System.err.println("���������, ��� ���� ���������� � �� ���������, � ���� � ����� ������ �����.");

        } catch (Exception e) {
            System.err.println("�������������� ������: " + e.getMessage());

        } finally {
            // ��������� ���� � ����������� ������� � ����� finally
            try {
                if (workbook != null) workbook.close();
                if (inputStream != null) inputStream.close();
            } catch (IOException ex) {
                System.err.println("������ ��� �������� �����: " + ex.getMessage());
            }
        }
    }
}
