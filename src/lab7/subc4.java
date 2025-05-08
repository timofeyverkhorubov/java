package lab7;

public class subc4 extends sc4 {
    public char charField;

    public subc4(int intField, char charField) {
        super(intField);
        this.charField = charField;
    }

    public subc4(subc4 other) {
        super(other.getIntField());
        this.charField = other.charField;
    }

    public void setFields(int intField, char charField) {
        setIntField(intField);
        this.charField = charField;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + ", intField = " + getIntField() + ", charField = " + charField;
    }
}
