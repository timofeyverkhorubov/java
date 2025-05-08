package lab1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = 2025;

        System.out.println("Input name : ");
        String name = in.nextLine();

        System.out.println("Input god rojdeniya: ");
        int god = in.nextInt();

        int vozrast = year - god;

        System.out.printf("%s %d \n", name, vozrast);
        in.close();
    }
}
