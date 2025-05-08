package lab1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("vvedi chislo: ");
        int num = in.nextInt();

        int nummen = num - 1;
        int numbol = num + 1;
        int kvadrat = (num + nummen + numbol) * (num + nummen + numbol);

        System.out.printf("%d %d %d %d \n", nummen, num, numbol, kvadrat );
        in.close();
    }
}
