package lab9;

public class example8 {
    public static void main(String[] args) {
        example8list listHead = new example8list();
        example8list listTail = new example8list();
        String[] values = {"Ahmed", "Mamed", "Mahmud", "Muhammad", "Andrey"};
        System.out.println("Заполение списка с головы:");
        listHead.createHead(values);
        System.out.println(listHead.toString());
        System.out.println("Заполение списка с хвоста:");
        listTail.createTail(values);
        System.out.println(listTail.toString());
        System.out.println("Добавление элемента в начало списка:");
        listHead.addFirst("Xi");
        System.out.println(listHead.toString());
        System.out.println("Добавление элемента в конец списка:");
        listHead.addLast("Albert");
        System.out.println(listHead.toString());
        System.out.println("Добавление элемента в указанное место списка:");
        listHead.insert(2, "Ivan");
        System.out.println(listHead.toString());
        System.out.println("Удаление первого элемента из списка:");
        listHead.removeFirst();
        System.out.println(listHead.toString());
        System.out.println("Удаление последнего элемента из списка:");
        listHead.removeLast();
        System.out.println(listHead.toString());
        System.out.println("Удаление элемента по индексу из списка:");
        listHead.remove(3);
        System.out.println(listHead.toString());
        example8list listHeadRec = new example8list();
        System.out.println("Заполение списка с головы c помощью рекурсии:");
        listHeadRec.createHeadRec(values);
        System.out.println(listHeadRec.toString());
        example8list listTailRec = new example8list();
        System.out.println("Заполение списка с хвоста с помощью рекурсии:");
        listTailRec.createTailRec(values);
        System.out.println(listTailRec.toString());
        System.out.println("Вывод списка с помощью рекурсии:");
        System.out.println(listTailRec.toStringRec());
    }
}
