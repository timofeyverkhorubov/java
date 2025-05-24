package lab13;

public class task1ex11 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
            System.exit(0);
        } finally {
            System.out.println("2");
        }
        System.out.println("3");
    }
}
