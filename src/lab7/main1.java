package lab7;

public class main1 {
    public static void main(String[] args) {
        sc1 superClassObject = new sc1("������� � ����������� �����������");
        String className = superClassObject.toString();
        System.out.println(className);

        subc1 subClassObject1 = new subc1("������� � ����������� ���������");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        subc1 subClassObject2 = new subc1("������� � ����������� ���������", "��� ��� ���������");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
