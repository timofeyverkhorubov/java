package lab13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task2ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Размер массива должен быть положительным.");
                return;
            }

            byte[] arr = new byte[size];
            System.out.println("Введите элементы массива (byte значения):");

            int sum = 0;

            for (int i = 0; i < size; i++) {
                try {
                    int inputValue = scanner.nextInt();
                    if (inputValue < Byte.MIN_VALUE || inputValue > Byte.MAX_VALUE) {
                        throw new IllegalArgumentException("Значение выходит за границы диапазона byte.");
                    }
                    arr[i] = (byte) inputValue;
                    sum += arr[i];
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: Введен неверный тип данных. Введите целое число.");
                    scanner.next();
                    i--;
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                    i--;
                }
            }

            System.out.println("Сумма элементов массива: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введен неверный размер массива. Введите целое число.");
        } finally {
            scanner.close();
        }
    }
}
