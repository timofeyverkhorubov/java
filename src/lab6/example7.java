package lab6;
import java.util.Arrays;
import java.util.Random;

public class example7 {
    public static int[] convertCharToIntArray(char[] charArray) {
        if (charArray == null) {
            return new int[0];
        }

        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = (int) charArray[i];
        }
        return intArray;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = random.nextInt(10) + 5;
        char[] charArray = new char[arraySize];

        for (int i = 0; i < arraySize; i++) {
            charArray[i] = (char) (random.nextInt(26) + 'a');
        }

        System.out.println("Исходный массив символов: " + Arrays.toString(charArray));

        int[] intArray = convertCharToIntArray(charArray);
        System.out.println("Полученный массив чисел: " + Arrays.toString(intArray));
    }
}
