package lab4;

import java.util.Random;

public class example5 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 5;

        int[][] originalArray = new int[rows][cols];
        Random random = new Random();

        System.out.println("Исходный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalArray[i][j] = random.nextInt(100);
                System.out.print(originalArray[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] transposedArray = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArray[j][i] = originalArray[i][j];
            }
        }

        System.out.println("\nТранспонированный массив:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
