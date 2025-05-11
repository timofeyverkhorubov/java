package lab11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex9 {
    public static void main(String[] args) {
        List<String> mixedStrings = Arrays.asList("abc123", "def", "456ghi", "jkl", "mno789");
        List<String> onlyLetters = filterStringsContainingOnlyLetters(mixedStrings);
        System.out.println("Строки, содержащие только буквы: " + onlyLetters);
    }

    public static List<String> filterStringsContainingOnlyLetters(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }
}
