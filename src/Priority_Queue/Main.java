package Priority_Queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("F");
        //System.out.println(queue.size());
        //System.out.println(queue.contains("2.0"));
        //System.out.println(queue.poll());
        //System.out.println(queue);
        //System.out.println(queue);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
