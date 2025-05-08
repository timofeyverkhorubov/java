package lab4;

public class example4 {
    public static void main(String[] args) {
        int height = 10;

        char[][] triangle = new char[height][];

        for (int i = 0; i < height; i++) {
            triangle[i] = new char[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = '*';
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }
}
