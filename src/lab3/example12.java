package lab3;
//1563
import java.util.Scanner;
import java.util.ArrayList;

public class example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        ArrayList<String> visitedShops = new ArrayList<>();
        int repeatCount = 0;

        for (int i = 0; i < n; i++) {
            String shopName = in.nextLine().trim();
            if (visitedShops.contains(shopName)) {
                repeatCount++;
            } else {
                visitedShops.add(shopName);
            }
        }

        System.out.println(repeatCount);
        in.close();
    }
}
