package collections;

import java.util.LinkedList;

public class ReversedLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.reversed());
    }
    
}
