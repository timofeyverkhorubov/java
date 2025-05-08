package lab7;

public class subc3 extends sc3 {
    public char charField;

    //  онструктор с двум€ параметрами
    public subc3(int intField, char charField) {
        super(intField);
        this.charField = charField;
    }

    // ѕерегрузка метода дл€ присваивани€ значений пол€м (включа€ поле суперкласса)
    public void setFields(int intField, char charField) {
        setIntField(intField);
        this.charField = charField;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + ", intField = " + getIntField() + ", charField = " + charField;
    }
}
