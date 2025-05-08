package lab6;

import java.util.Arrays;
import java.util.Random;

public class example3 {
    public static int findMax(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Массив пустой, возвращаю 0");
            return 0;
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findMin(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Массив пустой, возвращаю 0");
            return 0;
        }
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static double findAverage(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Массив пустой, возвращаю 0");
            return 0;
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = random.nextInt(10) + 1;
        int[] randomNumbers = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            randomNumbers[i] = random.nextInt(100);
        }

        System.out.println("Сгенерированный массив: " + Arrays.toString(randomNumbers));

        int max = example3.findMax(randomNumbers);
        int min = example3.findMin(randomNumbers);
        double average = example3.findAverage(randomNumbers);

        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
        System.out.println("Среднее арифметическое: " + average);

        System.out.println("Анализ с переменным количеством аргументов");
        int maxVarArgs = example3.findMax(1, 5, 2, 8, 3);
        int minVarArgs = example3.findMin(1, 5, 2, 8, 3);
        double averageVarArgs = example3.findAverage(1, 5, 2, 8, 3);

        System.out.println("Максимум: " + maxVarArgs);
        System.out.println("Минимум: " + minVarArgs);
        System.out.println("Среднее арифметическое: " + averageVarArgs);
    }
}
