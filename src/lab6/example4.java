package lab6;

public class example4 {
    public static int calculateDoubleFactorial(int n) {
        if (n <= 0) {
            return 1;
        }

        int result = 1;
        int i = n;

        if (n % 2 == 0) {
            while (i >= 2) {
                result *= i;
                i -= 2;
            }
        } else {
            while (i >= 1) {
                result *= i;
                i -= 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("6!! = " + calculateDoubleFactorial(6));
        System.out.println("5!! = " + calculateDoubleFactorial(5));
        System.out.println("7!! = " + calculateDoubleFactorial(7));
        System.out.println("8!! = " + calculateDoubleFactorial(8));
    }
}
