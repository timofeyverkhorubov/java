package lab9;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        recursiveInput(array, 0, scanner);

        System.out.println("Вывод массива:");
        recursiveOutput(array, 0);

        scanner.close();
    }

    public static void recursiveInput(int[] array, int index, Scanner scanner) {
        if (index == array.length) {
            return;
        }

        System.out.print("Элемент [" + index + "]: ");
        array[index] = scanner.nextInt();

        recursiveInput(array, index + 1, scanner);
    }

    public static void recursiveOutput(int[] array, int index) {
        if (index == array.length) {
            return;
        }

        System.out.print(array[index] + " ");

        recursiveOutput(array, index + 1);
    }
}
