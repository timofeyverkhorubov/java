package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("введите два числа");
        int num1 = in.nextInt();
        int num2 = in.nextInt();


        if (num1 > num2) {
            System.out.println(num2);
            System.out.println(num1);
        } else if (num1 < num2) {
            System.out.println(num1);
            System.out.println(num2);
        } else{
            System.out.println("Значения равны");
            System.out.println(num1);
        }
    }
}