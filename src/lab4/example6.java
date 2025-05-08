package lab4;

import java.util.Random;
import java.util.Arrays;

public class example6 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 7;
        int[][] originalArray = new int[rows][cols];
        Random random = new Random();

        System.out.println("Исходный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalArray[i][j] = random.nextInt(100);
            }
            System.out.println(Arrays.toString(originalArray[i]));
        }

        int rowIndexToDelete = random.nextInt(rows);
        int colIndexToDelete = random.nextInt(cols);

        System.out.println("\nИндекс строки для удаления: " + rowIndexToDelete);
        System.out.println("Индекс столбца для удаления: " + colIndexToDelete);

        int newRows = rows - 1;
        int newCols = cols - 1;
        int[][] newArray = new int[newRows][newCols];

        int newRowIndex = 0;
        for (int i = 0; i < rows; i++) {
            if (i == rowIndexToDelete) {
                continue;
            }
            int newColIndex = 0;
            for (int j = 0; j < cols; j++) {
                if (j == colIndexToDelete) {
                    continue;
                }
                newArray[newRowIndex][newColIndex] = originalArray[i][j];
                newColIndex++;
            }
            newRowIndex++;
        }

        System.out.println("\nНовый массив (после удаления строки и столбца):");
        for (int i = 0; i < newRows; i++) {
            System.out.println(Arrays.toString(newArray[i]));
        }
    }
}
