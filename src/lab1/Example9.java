package lab1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        int year = 2025;

        Scanner in = new Scanner(System.in);

        System.out.println("god rojdeniya: ");
        int god = in.nextInt();

        int age = year - god;

        System.out.printf("primerno tvoy vozrast %d \n", age );
        in.close();
    }
}
