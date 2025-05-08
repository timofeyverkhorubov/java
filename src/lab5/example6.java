package lab5;

public class example6 {
    private int max;
    private int min;

    public example6(int a, int b) {
        if (a > b) {
            this.max = a;
            this.min = b;
        } else {
            this.max = b;
            this.min = a;
        }
    }

    public void setValues(int a) {
        if (a > this.max) {
            this.max = a;
        }
        if (a < this.min) {
            this.min = a;
        }
    }

    public void setValues(int a, int b) {
        int newMax = Math.max(Math.max(this.max, a), b);
        int newMin = Math.min(Math.min(this.min, a), b);
        this.max = newMax;
        this.min = newMin;
    }

    public void display() {
        System.out.println("max = " + max + ", min = " + min);
    }
    public static void main(String[] args) {
        example6 obj = new example6(5, 10);
        obj.display();

        obj.setValues(3);
        obj.display();

        obj.setValues(15, 7);
        obj.display();
    }
}
