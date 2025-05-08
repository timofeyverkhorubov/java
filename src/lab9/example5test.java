package lab9;

public class example5test {
    public static void main(String[] args) {
        example5node node0 = new example5node(0, null);
        example5node node1 = new example5node(1, null);
        example5node node2 = new example5node(2, null);
        example5node node3 = new example5node(3, null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        example5node ref = node0;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
