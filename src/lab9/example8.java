package lab9;

public class example8 {
    public static void main(String[] args) {
        example8list listHead = new example8list();
        example8list listTail = new example8list();
        String[] values = {"Ahmed", "Mamed", "Mahmud", "Muhammad", "Andrey"};
        System.out.println("��������� ������ � ������:");
        listHead.createHead(values);
        System.out.println(listHead.toString());
        System.out.println("��������� ������ � ������:");
        listTail.createTail(values);
        System.out.println(listTail.toString());
        System.out.println("���������� �������� � ������ ������:");
        listHead.addFirst("Xi");
        System.out.println(listHead.toString());
        System.out.println("���������� �������� � ����� ������:");
        listHead.addLast("Albert");
        System.out.println(listHead.toString());
        System.out.println("���������� �������� � ��������� ����� ������:");
        listHead.insert(2, "Ivan");
        System.out.println(listHead.toString());
        System.out.println("�������� ������� �������� �� ������:");
        listHead.removeFirst();
        System.out.println(listHead.toString());
        System.out.println("�������� ���������� �������� �� ������:");
        listHead.removeLast();
        System.out.println(listHead.toString());
        System.out.println("�������� �������� �� ������� �� ������:");
        listHead.remove(3);
        System.out.println(listHead.toString());
        example8list listHeadRec = new example8list();
        System.out.println("��������� ������ � ������ c ������� ��������:");
        listHeadRec.createHeadRec(values);
        System.out.println(listHeadRec.toString());
        example8list listTailRec = new example8list();
        System.out.println("��������� ������ � ������ � ������� ��������:");
        listTailRec.createTailRec(values);
        System.out.println(listTailRec.toString());
        System.out.println("����� ������ � ������� ��������:");
        System.out.println(listTailRec.toStringRec());
    }
}
