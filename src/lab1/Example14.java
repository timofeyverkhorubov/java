package lab1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("vvedi chislo 1: ");
        int numone = in.nextInt();

        System.out.println("vvedi chislo 2: ");
        int numtwo = in.nextInt();

        int sum = numone + numtwo;
        int dif = numone - numtwo;

        System.out.printf("%d + %d =  %d \n", numone, numtwo, sum );
        System.out.printf("%d - %d =  %d \n", numone, numtwo, dif );
        in.close();
    }
}
