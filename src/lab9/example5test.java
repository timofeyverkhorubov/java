package lab9;

public class example5test {
    public static void main(String[] args) {
        example5node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new example5node(i, head);
        }
        example5node ref = head;
        System.out.println("Односвязный список с хвоста");
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
