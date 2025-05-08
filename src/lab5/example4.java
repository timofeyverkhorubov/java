package lab5;

public class example4 {
    private char ch;
    private int num;

    public example4(int n, char c) {
        this.num = n;
        this.ch = c;
    }

    public example4(double d) {
        this.ch = (char) ((int) d);
        this.num = (int) ((d * 100) % 100);
    }

    public char getCh() {
        return ch;
    }

    public int getNum() {
        return num;
    }
    public static void main(String[] args) {
        example4 obj1 = new example4(10, 'B');
        System.out.println("obj1: ch = " + obj1.getCh() + ", num = " + obj1.getNum());

        example4 obj2 = new example4(65.1267);
        System.out.println("obj2: ch = " + obj2.getCh() + ", num = " + obj2.getNum());
    }
}
