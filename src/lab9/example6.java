package lab9;

import java.util.HashMap;
import java.util.Map;

public class example6 {
    public static void main(String[] args) {
        HashMap<Integer, String> keyAndValue = new HashMap<>();
        int result = 1;
        for (int i = 0; i <= 10; i++) {
            String test = "Hi";
            keyAndValue.put(i, test.repeat(i));
        }
        System.out.println(keyAndValue);
        for (Integer key : keyAndValue.keySet()) {
            if (key < 5) {
                continue;
            }
            System.out.println(keyAndValue.get(key));
        }
        for (Map.Entry<Integer, String> entry : keyAndValue.entrySet()) {
            String check = entry.getValue();
            if (check.length() > 5) {
                result *= entry.getKey();
            }
        }
        System.out.println(result);
    }
}
