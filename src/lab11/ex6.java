package lab11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;


public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(1000));
        }

        System.out.println("Сгенерированный массив: " + numbers);

        System.out.print("Введите число, на которое нужно делить: ");
        int divisor = scanner.nextInt();

        List<Integer> divisibleNumbers = filterDivisibleNumbers(numbers, divisor);

        System.out.println("Числа, делящиеся на " + divisor + ": " + divisibleNumbers);

        scanner.close();
    }

    public static List<Integer> filterDivisibleNumbers(List<Integer> list, int divisor) {
        return list.stream()
                .filter(x -> x % divisor == 0)
                .collect(Collectors.toList());
    }
}
