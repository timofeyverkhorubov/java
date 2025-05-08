package lab7;

public class ex1 {

    private String str1;

    // Конструктор с текстовым аргументом
    public ex1(String strEx) {
        this.str1 = strEx;
    }

    // Конструктор по умолчанию
    public ex1() {
    }

    @Override
    public String toString() {
        return "SuperClassTest{" +
                "str1='" + str1 + '\'' +
                '}';
    }


    public String getStr1() {
        return str1;
    }


    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public static void main(String[] args) {
        ex1 test1 = new ex1("Hello");
        System.out.println(test1.toString()); // Выведет: SuperClassTest{str1='Hello'}

        ex1 test2 = new ex1();
        test2.setStr1("World");
        System.out.println(test2.toString()); // Выведет: SuperClassTest{str1='World'}
    }
}
