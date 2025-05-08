package lab9;

public class example4test {
    public static void main(String[] args) {
        example4node node0 = new example4node(0, null);
        example4node node1 = new example4node(1, null);
        example4node node2 = new example4node(2, null);
        example4node node3 = new example4node(3, null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        example4node ref = node0;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
