package Linked_List;

import java.util.LinkedList;

public class linked {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        //linkedList.push("A");
        //linkedList.push("B");
        //linkedList.push("C");
        //linkedList.push("D");
        //linkedList.push("");
        //linkedList.add(3, "Jeff");
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");
        linkedList.offer("F");
        //linkedList.poll();
        linkedList.add(5, "Jeff");
        linkedList.remove("D");
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        //linkedList.addFirst("9");
        //linkedList.addLast("AD");
        System.out.println(linkedList);
    }
}
