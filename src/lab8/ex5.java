package lab8;

import java.io.*;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������� ��� ����� => ");
        String fname = sc.nextLine();
        try {
            File f1 = new File(fname);
            f1.createNewFile();
            System.out.println("������ ���� �����: " + f1.getAbsolutePath());
            System.out.print("������� ���������� ����� ��� ������ � ���� => ");
            int n = sc.nextInt();
            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.print("������� ������ ��� ������ � ���� => ");
                String s = sc.nextLine();
                dOut.writeUTF(s);
            }
            dOut.flush();
            dOut.close();

            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            while (true) {
                System.out.println(dIn.readUTF());
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
