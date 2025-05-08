package lab7;

public class thc3 extends subc3 {

    private String strField;

    public thc3(int intField, char charField, String strField) {
        super(intField, charField);
        this.strField = strField;
    }

    public void setFields(int intField, char charField, String strField) {
        setFields(intField, charField);

        this.strField = strField;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + ", intField = " + getIntField() + ", charField = " + charField + ", strField = '" + strField + "'";
    }
}
