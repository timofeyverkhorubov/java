package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("������� �����");
        int num = in.nextInt();

        String day;

        switch (num){
            case 1:
                day = "�����������";
                break;
            case 2:
                day = "�������";
                break;
            case 3:
                day = "�����";
                break;
            case 4:
                day = "�������";
                break;
            case 5:
                day = "�������";
                break;
            case 6:
                day = "�������";
                break;
            case 7:
                day = "�����������";
                break;
            default:
                day = "������������ �����";
                break;
        }
        System.out.println(day);
    }
}
