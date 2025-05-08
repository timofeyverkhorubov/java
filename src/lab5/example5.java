package lab5;

public class example5 {
    private int value;

    public example5() {
        this.value = 0;
    }

    public example5(int value) {
        setValue(value);
    }

    public void setValue(int value) {
        if (value > 100) {
            this.value = 100;
        } else {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }
    public static void main(String[] args) {
        example5 obj1 = new example5();
        System.out.println("obj1: value = " + obj1.getValue());

        example5 obj2 = new example5(50);
        System.out.println("obj2: value = " + obj2.getValue());

        example5 obj3 = new example5(150);
        System.out.println("obj3: value = " + obj3.getValue());

        obj1.setValue(75);
        System.out.println("obj1: value = " + obj1.getValue());

        obj2.setValue(200);
        System.out.println("obj2: value = " + obj2.getValue());
    }
}
