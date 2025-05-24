package lab12;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ex6 {
    private static final Object lock = new Object();
    private static int [] numbers;
    private static int result = 0;
    private static int currentIndex = 0;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Генерируем случайные числа от 0 до 99
        }

        System.out.println("Сгенерированный массив: " + Arrays.toString(numbers));

        int cores = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[cores];
        for (int i = 0; i < cores; i++) {
            threads[i] = new Thread(() -> {
                int localResult = 0;
                int sizeBlock = 2;
                while (true) {
                    int startIndex, endIndex;
                    synchronized (lock) {
                        startIndex = currentIndex;
                        endIndex = Math.min(currentIndex + sizeBlock, numbers.length);
                        currentIndex = endIndex;
                        if (startIndex >= numbers.length) {
                            break;
                        }
                    }
                    for (int g = startIndex; g < endIndex; g++) {
                        localResult += numbers[g];
                    }
                }
                synchronized (lock) {
                    result += localResult;
                }
            });
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("Сумма элементов в массиве: " + result);
        scanner.close();
    }
}
