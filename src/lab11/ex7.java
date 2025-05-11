package lab11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex7 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");
        int minLength = 5;
        List<String> longerStrings = filterStringsLongerThan(stringList, minLength);
        System.out.println("Строки длиннее " + minLength + " символов: " + longerStrings);
    }

    public static List<String> filterStringsLongerThan(List<String> list, int minLength) {
        return list.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }
}
