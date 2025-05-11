package lab11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apricot", "avocado", "grape");
        String substring = "ap";
        List<String> filteredStrings = filterStringsContainingSubstring(strings, substring);
        System.out.println("Строки, содержащие '" + substring + "': " + filteredStrings);
    }

    public static List<String> filterStringsContainingSubstring(List<String> list, String substring) {
        return list.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}
