package lab9;

public class ex5 {
    public  static void main(String[] args) {
        System.out.println(fact(7));
    }

    public static int fact(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int number = fact(n - 2) + fact(n - 1);
            System.out.println("n = " + n + "->" + number);
            return number;
        }
    }
}
