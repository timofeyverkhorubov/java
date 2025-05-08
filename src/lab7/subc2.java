package lab7;

public class subc2 extends sc2 {
    public int intField;

    public subc2(int intField, String str1) {
        super(str1);
        this.intField = intField;
    }

    public void setFields() {
        setStr1("Default value");
        intField = 0;
    }

    public void setFields(String str1) {
        setStr1(str1);
        intField = 0;
    }

    public void setFields(int intField) {
        setStr1("Default value");
        this.intField = intField;
    }

    public void setFields(String str1, int intField) {
        setStr1(str1);
        this.intField = intField;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + ", str1 = " + getStr1() + ", intField = " + intField;
    }
}
