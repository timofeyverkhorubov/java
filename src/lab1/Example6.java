package lab1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input familiya: ");
        String familiya = in.nextLine();

        System.out.println("Input otchestvo: ");
        String itchestvo = in.nextLine();

        System.out.printf("Hello %s %s %s ! \n", name, familiya, itchestvo);
        in.close();
    }
}
