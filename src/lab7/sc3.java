package lab7;

public class sc3 {
    private int intField;

    public sc3(int intField) {
        this.intField = intField;
    }

    public int getIntField() {
        return intField;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + ", intField = " + intField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }
}
