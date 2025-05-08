package lab7;

public class sc2 {
    private String str1;

    public sc2(String str1) {
        this.str1 = str1;
    }

    public int getStringLength() {
        return str1.length();
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + ", str1 = " + str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr1() {
        return str1;
    }
}
