package lab9;

import java.util.ArrayList;
import java.util.LinkedList;

public class example7 {
    public static void main(String[] args) {
        ArrayList<Integer> humansArrayList = new ArrayList<Integer>();
        int index = 0;
        for (int i = 1; i <= 10; i++) {
            humansArrayList.add(i);
        }
        System.out.println("ArrayList -> " + humansArrayList);
        long startTime1 = System.nanoTime();
        while (humansArrayList.size() != 1) {
            index = (index + 1) % humansArrayList.size();
            humansArrayList.remove(index);
        }
        long time1 = System.nanoTime() - startTime1;
        System.out.println("Время выполнения: " + time1);


        LinkedList<Integer> humansLinkedList = new LinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            humansLinkedList.add(i);
        }
        System.out.println("LinkedList -> " + humansLinkedList);
        long startTime2 = System.nanoTime();
        index = 0;
        while (humansLinkedList.size() != 1) {
            index = (index + 1) % humansLinkedList.size();
            humansLinkedList.remove(index);
        }
        long time2 = System.nanoTime() - startTime2;
        System.out.println("Время выполнения: " + time2);
    }
}
