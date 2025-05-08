//timus 1005
package lab3;

import java.util.Scanner;

public class example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] weights = new int[n];
        int totalWeight = 0;
        for (int i = 0; i < n; i++) {
            weights[i] = in.nextInt();
            totalWeight += weights[i];
        }

        boolean[][] dp = new boolean[n + 1][totalWeight + 1];
        dp[0][0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= totalWeight; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= weights[i - 1]) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - weights[i - 1]];
                }
            }
        }

        int minDifference = totalWeight;
        for (int j = totalWeight / 2; j >= 0; j--) {
            if (dp[n][j]) {
                minDifference = totalWeight - 2 * j;
                break;
            }
        }

        System.out.println(minDifference);
    }
}
