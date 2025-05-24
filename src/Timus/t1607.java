package Timus;

import java.util.Scanner;

public class t1607 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // Цена Пети
        int b = scanner.nextInt(); // Надбавка Пети
        int c = scanner.nextInt(); // Цена таксиста
        int d = scanner.nextInt(); // Скидка таксиста

        if (a >= c) {
            System.out.println(a); // Если сразу сошлись
            return;
        }

        while (a < c) {
            int nextA = a + b;
            if (nextA >= c) {
                System.out.println(c); // Принимаем цену таксиста
                return;
            } else {
                a = nextA;
                c -= d;
            }
        }

        System.out.println(a); // Этот случай не должен произойти
    }
}
