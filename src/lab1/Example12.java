package lab1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("vvedi 1 chislo: ");
        int one = in.nextInt();

        System.out.println("vvedi 2 chislo: ");
        int two = in.nextInt();

        int sum = one + two;

        System.out.printf("%d + %d = %d \n", one, two, sum );
        in.close();
    }
}
