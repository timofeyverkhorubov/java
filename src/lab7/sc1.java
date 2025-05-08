package lab7;

public class sc1 {
    private String str1;

    public sc1(String str1) {
        this.str1 = str1;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + ", str1 = " + str1;
    }

    public String getStr1() {
        return str1;
    }
}
