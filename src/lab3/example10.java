package lab3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();

        if (size <= 0) {
            System.out.println("Ошибка: Размер массива должен быть положительным.");
            in.close();
            return;
        }

        Integer[] arr = new Integer[size];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.print("Исходный массив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.print("Отсортированный массив (по убыванию): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        in.close();
    }
}
