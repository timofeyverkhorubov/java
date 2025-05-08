package lab6;

import java.util.Scanner;

public class example1 {
    private char ch;
    private String str;

    public void setValue(char c) {
        this.ch = c;
    }

    public void setValue(String s) {
        this.str = s;
    }

    public void setValue(char[] arr) {
        if (arr.length == 1) {
            this.ch = arr[0];
        } else {
            this.str = new String(arr);
        }
    }

    public char getCh() {
        return ch;
    }

    public String getStr() {
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        example1 obj = new example1();

        System.out.println("¬ведите значение:");
        String input = scanner.nextLine();

        if (input.length() == 1) {
            obj.setValue(input.charAt(0));
        } else {
            boolean allChars = true;
            for (int i = 0; i < input.length(); i++) {
                if (!Character.isLetterOrDigit(input.charAt(i))) {
                    allChars = false;
                    break;
                }
            }

            if (allChars) {
                obj.setValue(input.toCharArray());
            } else {
                obj.setValue(input);
            }

        }

        System.out.println("ch = " + obj.getCh() + ", str = " + obj.getStr());
        scanner.close();
    }
}
