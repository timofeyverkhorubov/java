package Timus;

import java.util.Scanner;

public class t1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;

        if (n > 0) {
            sum = (long) n * (n + 1) / 2;
        } else {
            for (int i = n; i <= 1; i++) {
                sum += i;
            }
        }

        System.out.println(sum);
        scanner.close();
    }
}
