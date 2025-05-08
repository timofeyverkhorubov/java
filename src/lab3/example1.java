package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("введите число");
        int num = in.nextInt();

        String day;

        switch (num){
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "Пятница";
                break;
            case 6:
                day = "Суббота";
                break;
            case 7:
                day = "Воскресенье";
                break;
            default:
                day = "Некорректный номер";
                break;
        }
        System.out.println(day);
    }
}
