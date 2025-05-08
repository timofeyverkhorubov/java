package lab9;

public class example4test {
    public static void main(String[] args) {
        example4node head = null;
        example4node ref;

        for (int i = 0; i < 5; i++) {
            head = new example4node(i, head);
        }

        ref = head;
        while (ref != null) {
            System.out.println("Value: " + ref.value);
            ref = ref.next;
        }
    }
}
