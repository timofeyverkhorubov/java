package lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("������� ������ �������");

        int size = id.nextInt();

        System.out.println("������ ������� ����� " + size);

        int[] nums = new int[size];

        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("������� ������� [" + i + "] = " + nums[i]);

        }
        Arrays.sort(nums);
        System.out.println("����������� ���������� �������");

        for (int i = 0; i < nums.length; i++) {
            // ��������� ������������ "��� ������� � ���������"
            System.out.println("������� ������� [" + i + "] ����� ���������� = " + nums[i]);
        }
    }
}

