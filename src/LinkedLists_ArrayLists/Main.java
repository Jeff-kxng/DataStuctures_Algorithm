package LinkedLists_ArrayLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        long startTime;
        long endtime;
        long elapseTime;
         for (int i = 0; i < 1000000; i++){
             linkedList.add(i);
             arrayList.add(i);
         }
         startTime = System.nanoTime();
         //arrayList.get(0);
         //do something
        endtime = System.nanoTime();
        elapseTime = System.nanoTime();
        System.out.println("Linkrdlist: \t" + elapseTime + "ns");
    }
}
