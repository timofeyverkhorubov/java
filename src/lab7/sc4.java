package lab7;

public class sc4 {
    private int intField;

    public sc4(int intField) {
        this.intField = intField;
    }

    // Конструктор копирования для SuperClassTest
    public sc4(sc4 other) {
        this.intField = other.intField;
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
