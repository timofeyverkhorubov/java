package lab7;

public class thc4 extends subc4 {

    private String strField;

    // ����������� � ����� �����������
    public thc4(int intField, char charField, String strField) {
        super(intField, charField);
        this.strField = strField;
    }

    // ����������� ����������� ��� ThirdClassTest
    public thc4(thc4 other) {
        super(other); // �������� ����������� ����������� SubClassTest
        this.strField = other.strField;
    }

    // ���������� ������ ��� ������������ �������� ����� (������� ���� ������������)
    public void setFields(int intField, char charField, String strField) {
        setFields(intField, charField); // ����� setFields �� SubClassTest
        this.strField = strField;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + ", intField = " + getIntField() + ", charField = " + charField + ", strField = '" + strField + "'";
    }
}