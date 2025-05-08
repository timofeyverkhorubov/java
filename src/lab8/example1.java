package lab8;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ��� ��������� �����: ");
        String inputFileName = scanner.nextLine();

        System.out.print("������� ��� ��������������� �����: ");
        String outputFileName = scanner.nextLine();

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            // 1. ������ �� ��������� �����
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(inputFileName), "UTF-8"));

            String firstLine = reader.readLine(); // ���������� ������ ������
            String secondLine = reader.readLine();
            String numbersLine = reader.readLine();
            ArrayList<Double> positiveNumbers = new ArrayList<>();

            if (numbersLine != null) {
                String[] numberStrings = numbersLine.split("\\s+"); // ��������� ������ �� ����� (����������� - ���� ��� ����� ��������)
                for (String numberString : numberStrings) {
                    try {
                        double number = Double.parseDouble(numberString);
                        if (number > 0) {
                            positiveNumbers.add(number);
                        }
                    } catch (NumberFormatException e) {
                        // ���������� ���������� ��������
                    }
                }
            }


            // 2. ������ � �������������� ����
            writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(outputFileName), "UTF-8"));

            if (secondLine != null) {
                writer.write(secondLine);
                writer.newLine();
            }

            for (Double number : positiveNumbers) {
                writer.write(number.toString());
                writer.newLine();
            }
            System.out.println("��������� ���������. ��������� ������� � ����: " + outputFileName);

        } catch (FileNotFoundException e) {
            System.err.println("������: ���� �� ������: " + inputFileName);
        } catch (IOException e) {
            System.err.println("������ ��� ������/������ �����: " + e.getMessage());
        } finally {
            // 3. �������� ������
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("������ ��� �������� ������: " + e.getMessage());
            }
        }
    }
}