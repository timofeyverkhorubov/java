package lab13;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class task2ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        try {
            System.out.print("Введите размер матрицы (X x X): ");
            int size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("Размер матрицы должен быть положительным.");
                return;
            }

            int[][] matrix = new int[size][size];

            System.out.println("Заполнение матрицы случайными числами:");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    matrix[i][j] = random.nextInt(100);
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("Введите номер столбца для вывода (начиная с 0): ");
            int columnNumber = scanner.nextInt();

            if (columnNumber < 0 || columnNumber >= size) {
                throw new ArrayIndexOutOfBoundsException("Столбца с таким номером не существует.");
            }

            System.out.println("Столбец " + columnNumber + ":");
            for (int i = 0; i < size; i++) {
                System.out.println(matrix[i][columnNumber]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введен неверный тип данных. Введите целое число.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
