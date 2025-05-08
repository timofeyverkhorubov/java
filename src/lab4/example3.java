package lab4;

public class example3 {
    public static void main(String[] args) {
        int width = 20;
        int height = 8;

        int[][] rectangle = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                rectangle[i][j] = 2;
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(rectangle[i][j]);
            }
            System.out.println();
        }
    }
}
