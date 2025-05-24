package lab12;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ex5 {
    private static int max = Integer.MIN_VALUE;
    private static final Object lock = new Object();
    private static int[] array;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        System.out.println("Сгенерированный массив: " + Arrays.toString(array));

        int numThreads = 6;
        Thread[] threads = new Thread[numThreads];
        int chunkSize = array.length / numThreads;

        for (int i = 0; i < numThreads; i++) {
            final int start = i * chunkSize;
            final int end = (i == numThreads - 1) ? array.length : (i + 1) * chunkSize;

            threads[i] = new Thread(() -> {
                int localMax = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    if (array[j] > localMax) {
                        localMax = array[j];
                    }
                }

                synchronized (lock) {
                    if (localMax > max) {
                        max = localMax;
                    }
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Максимальный элемент: " + max);
        scanner.close();
    }
}
