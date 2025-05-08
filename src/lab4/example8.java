package lab4;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("������� ����� ��� ����������:");
        String text = scanner.nextLine();

        System.out.println("������� ����:");
        int key = scanner.nextInt();
        scanner.nextLine();

        String encryptedText = encrypt(text, key);
        System.out.println("����� ����� ��������������: " + encryptedText);

        System.out.println("��������� �������� ��������������? (y/n)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("y")) {
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("����� ����� ��������� ��������������: " + decryptedText);
        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println("�� ��������!");
        } else {
            System.out.println("������� ���������� �����.");
        }

        scanner.close();
    }

    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                result.append((char) ((ch - base + key) % 26 + base));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String decrypt(String text, int key) {
        return encrypt(text, 26 - (key % 26));
    }
}
