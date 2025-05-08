package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели с большой буквы без пробелов, запятых и других знаков препинания согласно толковому словарю русского языка Ожегова");
        String word = in.next();

        int num;

        switch (word){
            case "Понедельник":
                num = 1;
                System.out.println(num);
                break;
            case "Вторник":
                num = 2;
                System.out.println(num);
                break;
            case "Среда":
                num = 3;
                System.out.println(num);
                break;
            case "Четверг":
                num = 4;
                System.out.println(num);
                break;
            case "Пятница":
                num = 5;
                System.out.println(num);
                break;
            case "Суббота":
                num = 6;
                System.out.println(num);
                break;
            case "Воскресенье":
                num = 7;
                System.out.println(num);
                break;
            default:
                System.out.println("Учи словарь или борись с мисскликом");
                break;
        }
    }
}