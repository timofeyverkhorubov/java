package lab11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            values.add(random.nextInt(1000));
        }

        System.out.println("Сгенерированный массив: " + values);

        System.out.print("Введите максимальное значение: ");
        int maxValue = scanner.nextInt();

        List<Integer> smallerNumbers = filterNumbersLessThan(values, maxValue);

        System.out.println("Числа меньше " + maxValue + ": " + smallerNumbers);

        scanner.close();
    }

    public static List<Integer> filterNumbersLessThan(List<Integer> list, int maxValue) {
        return list.stream()
                .filter(x -> x < maxValue)
                .collect(Collectors.toList());
    }
}
