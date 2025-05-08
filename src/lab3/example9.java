package lab3;

import java.util.Random;
import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {

        int min = 1000;

        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите количество чисел (больше 1)");
        int size = in.nextInt();

        if (size <= 1) {
            System.out.println("ќшибка: ¬ведите число больше 1");
            return;
        }

        int[] mass = new int[size];

        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(5);
            if(mass[i] < min){
                min = mass[i];
            }
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }

        for (int i = 0; i < mass.length; i++) {
            if(mass[i] == min){
                System.out.println("индекс с минимальным числом " + min + " - " + i);
            }
        }
    }

}
