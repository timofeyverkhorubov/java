package lab1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        int year = 2025;

        Scanner in = new Scanner(System.in);

        System.out.println("vozrast: ");
        int age = in.nextInt();

        int god = year - age;

        System.out.printf("primerno tvoy god rojdeniya %d \n", god );
        in.close();
    }
}
