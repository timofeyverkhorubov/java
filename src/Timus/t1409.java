package Timus;

import java.util.Scanner;

public class t1409 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        int l = in.nextInt();

        int s = g + l - 1;

        g = s - g;
        l = s - l;
        System.out.println(g + " " + l);
    }
}
