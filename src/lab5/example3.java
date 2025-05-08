package lab5;

public class example3 {
    private int num1;
    private int num2;

    public example3() {
        this.num1 = 0;
        this.num2 = 0;
        System.out.println("Конструктор без аргументов вызван.");
    }

    public example3(int num) {
        this.num1 = num;
        this.num2 = 0;
        System.out.println("Конструктор с одним аргументом вызван. num1 = " + num1);
    }

    public example3(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Конструктор с двумя аргументами вызван. num1 = " + num1 + ", num2 = " + num2);
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
    public static void main(String[] args) {
        example3 obj1 = new example3();
        System.out.println("obj1: num1 = " + obj1.getNum1() + ", num2 = " + obj1.getNum2());

        example3 obj2 = new example3(10);
        System.out.println("obj2: num1 = " + obj2.getNum1() + ", num2 = " + obj2.getNum2());

        example3 obj3 = new example3(20, 30);
        System.out.println("obj3: num1 = " + obj3.getNum1() + ", num2 = " + obj3.getNum2());
    }
}
