package lab6;

import java.util.Arrays;
import java.util.Random;

public class example6 {
    public static int[] createSubarray(int[] arr, int length) {
        if (length >= arr.length) {
            return Arrays.copyOf(arr, arr.length);
        }

        int[] result = new int[length];
        System.arraycopy(arr, 0, result, 0, length);
        return result;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = random.nextInt(10) + 5;
        int[] initialArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            initialArray[i] = random.nextInt(100);
        }

        int subarrayLength = random.nextInt(arraySize + 3);

        System.out.println("Исходный массив: " + Arrays.toString(initialArray));
        System.out.println("Длина подмассива: " + subarrayLength);

        int[] subarray = createSubarray(initialArray, subarrayLength);
        System.out.println("Полученный подмассив: " + Arrays.toString(subarray));
    }
}
