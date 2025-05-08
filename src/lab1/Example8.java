package lab1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input den nedeli : ");
        String monday = in.nextLine();

        System.out.println("Input mesyats : ");
        String mesyats = in.nextLine();

        System.out.println("Input nomer dnya v mesyatse: ");
        int number = in.nextInt();

        System.out.printf( "%s %d %s  \n", monday, number, mesyats);
        in.close();
    }
}
