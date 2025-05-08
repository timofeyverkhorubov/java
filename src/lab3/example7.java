package lab3;
import java.util.Scanner;
public class example7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ ����������� �������:");
        int size = in.nextInt();

        if (size <= 0) {
            System.out.println("������: ������ ������� ������ ���� �������������.");
            in.close();
            return;
        }

        char[] charArray = new char[size];

        char currentChar = 'a';
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = currentChar;
            currentChar += 2;
        }

        System.out.print("������ �������: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("�������� �������: ");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();

        in.close();
    }
}
