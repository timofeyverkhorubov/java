package lab13;

public class task1ex3 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
        } catch (Exception e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
}
