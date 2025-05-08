package lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("введите размер массива");

        int size = id.nextInt();

        System.out.println("размер массива равен " + size);

        int[] nums = new int[size];

        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);

        }
        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива");

        for (int i = 0; i < nums.length; i++) {
            // Сообщение пользователю "для красоты и понимания"
            System.out.println("Элемент массива [" + i + "] после сортировки = " + nums[i]);
        }
    }
}

