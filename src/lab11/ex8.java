package lab11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numberList.add(random.nextInt(1000));
        }

        System.out.println("Сгенерированный массив: " + numberList);

        System.out.print("Введите минимальное значение: ");
        int minValue = scanner.nextInt();

        List<Integer> greaterNumbers = filterNumbersGreaterThan(numberList, minValue);

        System.out.println("Числа больше " + minValue + ": " + greaterNumbers);

        scanner.close();
    }

    public static List<Integer> filterNumbersGreaterThan(List<Integer> list, int minValue) {
        return list.stream()
                .filter(x -> x > minValue)
                .collect(Collectors.toList());
    }
}
