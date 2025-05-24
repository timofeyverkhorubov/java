package lab13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task2ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Размер массива должен быть положительным.");
                return;
            }

            int[] arr = new int[size];
            System.out.println("Введите элементы массива (целые числа):");

            int sum = 0;
            int count = 0;

            for (int i = 0; i < size; i++) {
                try {
                    arr[i] = scanner.nextInt();
                    if (arr[i] > 0) {
                        sum += arr[i];
                        count++;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: Введен неверный тип данных. Введите целое число.");
                    scanner.next();
                    i--;
                }
            }

            if (count == 0) {
                throw new IllegalArgumentException("В массиве отсутствуют положительные элементы.");
            }

            double average = (double) sum / count;
            System.out.println("Среднее значение положительных элементов: " + average);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введен неверный размер массива. Введите целое число.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
