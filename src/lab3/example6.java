package lab3;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите количество суммируемых чисел (больше 1)");
        int size1 = in.nextInt();

        if (size1 <= 1) {
            System.out.println("ќшибка: ¬ведите число больше 1");
            return;
        }

        int[] numssize = new int[size1];
        int[] nums2 = new int[1000];
        int a = 0;

        for (int i = 2; i < nums2.length; i++) {
            nums2[i] = i + 1;
        }

        for (int i = 2; a < numssize.length && i < nums2.length; i++) {
            if (nums2[i] % 5 == 2) {
                numssize[a] = nums2[i];
                a++;
            }
        }


        for (int i = 0; i < numssize.length; i++) {
            System.out.println(numssize[i]);
        }

        in.close();
    }
}
