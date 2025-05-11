package lab9;

import java.util.Scanner;

public class example2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число");
            int number = in.nextInt();
            String result = transfer(number, "");
            StringBuilder sb = new StringBuilder(result);
            System.out.print(sb.reverse());
        }

        public static String transfer(int number, String result) {
            if (number == 0) {
                result += Integer.toString(number);
                return result;
            } else if (number == 1) {
                result += Integer.toString(number);
                return result;
            } else {
                result += Integer.toString(number % 2);
                return transfer(number / 2, result);
            }
        }
}
