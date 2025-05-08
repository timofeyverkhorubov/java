package lab6;

public class example5 {
    public static long calculateSumOfSquares(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i;
        }
        return sum;
    }

    public static long calculateSumOfSquaresFormula(int n) {
        return (long) n * (n + 1) * (2 * n + 1) / 6;
    }

    public static void main(String[] args) {
        int n = 3;
        long sum1 = calculateSumOfSquares(n);
        long sum2 = calculateSumOfSquaresFormula(n);

        System.out.println("����� ��������� �� 1 �� " + n + " (����): " + sum1);
        System.out.println("����� ��������� �� 1 �� " + n + " (�������): " + sum2);

        if (sum1 == sum2) {
            System.out.println("��� ������ ���� ���������� ���������!");
        } else {
            System.out.println("���-�� ����� �� ���, ���������� ������.");
        }
    }
}
