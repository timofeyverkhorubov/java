package Timus;

import java.util.Arrays;
import java.util.Scanner;

public class t1025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k;
        int min = 0;

        k = in.nextInt();

        int[] array = new int[k];

        for (int i = 0; i < k; i++) {
            array[i] = in.nextInt();
        }

        Arrays.sort(array);

        int mingroups = (k + 1) / 2;

        for (int i = 0; i < mingroups; i++) {
            min += (array[i] / 2) + 1;
        }

        System.out.println(min);

        in.close();
    }
}
