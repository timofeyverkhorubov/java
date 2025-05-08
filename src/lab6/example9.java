package lab6;
import java.util.Arrays;
import java.util.Random;
public class example9 {
    public static void reverseArray(char[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = random.nextInt(10) + 5;
        char[] charArray = new char[arraySize];

        for (int i = 0; i < arraySize; i++) {
            charArray[i] = (char) (random.nextInt(26) + 'a');
        }

        System.out.println("Исходный массив: " + Arrays.toString(charArray));

        example9.reverseArray(charArray);

        System.out.println("Перевернутый массив: " + Arrays.toString(charArray));
    }
}
