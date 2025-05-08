package lab4;

public class example7 {
    public static void main(String[] args) {
        int rows = 6;
        int cols = 12;
        int[][] snakeArray = new int[rows][cols];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    snakeArray[i][j] = value++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    snakeArray[i][j] = value++;
                }
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", snakeArray[i][j]);
            }
            System.out.println();
        }
    }
}
