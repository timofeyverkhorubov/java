package lab7;

public class thc4 extends subc4 {

    private String strField;

    // Конструктор с тремя параметрами
    public thc4(int intField, char charField, String strField) {
        super(intField, charField);
        this.strField = strField;
    }

    // Конструктор копирования для ThirdClassTest
    public thc4(thc4 other) {
        super(other); // Вызываем конструктор копирования SubClassTest
        this.strField = other.strField;
    }

    // Перегрузка метода для присваивания значений полям (включая поле суперклассов)
    public void setFields(int intField, char charField, String strField) {
        setFields(intField, charField); // Вызов setFields из SubClassTest
        this.strField = strField;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + ", intField = " + getIntField() + ", charField = " + charField + ", strField = '" + strField + "'";
    }
}