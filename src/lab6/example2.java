package lab6;

public class example2 {
    private static int count = 0;

    public static void incrementAndPrint() {
        System.out.println(count);
        count++;
    }

    public static void main(String[] args) {
        example2.incrementAndPrint();
        example2.incrementAndPrint();
        example2.incrementAndPrint();
    }
}
