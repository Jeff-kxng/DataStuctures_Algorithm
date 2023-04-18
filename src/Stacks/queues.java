package Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class queues {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Apple");
        queue.offer("Egg");
        queue.offer("Sugar");
        queue.offer("Orange");
        queue.poll();
        System.out.println(queue.size());
        System.out.println(queue);
        System.out.println(queue.contains("Egg"));
        System.out.println(queue.isEmpty());
    }
}
