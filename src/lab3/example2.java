package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("������� �������� ��� ������ � ������� ����� ��� ��������, ������� � ������ ������ ���������� �������� ��������� ������� �������� ����� �������");
        String word = in.next();

        int num;

        switch (word){
            case "�����������":
                num = 1;
                System.out.println(num);
                break;
            case "�������":
                num = 2;
                System.out.println(num);
                break;
            case "�����":
                num = 3;
                System.out.println(num);
                break;
            case "�������":
                num = 4;
                System.out.println(num);
                break;
            case "�������":
                num = 5;
                System.out.println(num);
                break;
            case "�������":
                num = 6;
                System.out.println(num);
                break;
            case "�����������":
                num = 7;
                System.out.println(num);
                break;
            default:
                System.out.println("��� ������� ��� ������ � ����������");
                break;
        }
    }
}