package lab8;

import java.io.File;
import java.io.IOException;

public class ex1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("������!!!!");
                System.out.println("������ ����1: " + f1.getAbsolutePath());
            }

            File f2 = new File("E:\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("������ ���� 2: " + f2.getAbsolutePath());

            File f3 = new File("E:\\Papka1\\Papka2\\Papka3");
            f3.mkdirs();
            System.out.println("������ ���� 3: " + f3.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("������!!! " + e);
        }
    }
}
