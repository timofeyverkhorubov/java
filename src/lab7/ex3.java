package lab7;

public class ex3 {
    public static void main(String[] args) {

        ex1 superClassObject =
                new ex1("������� � ����������� �����������");
        String className = superClassObject.toString();
        System.out.println(className);

        ex2 subClassObject1 =
                new ex2("������� � ����������� ���������");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        ex2 subClassObject2 =
                new ex2("������� � ����������� ���������", "��� ��� ���������");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
