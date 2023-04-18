package HashTable;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);
         table.put(100, "Apple");
         table.put(111, "Pink");
         table.put(123, "Blue");
         table.put(134, "TXT");
         table.put(145, "BTS");
         // table.remove(145);
         for (Integer key : table.keySet()) {
             System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
         }
    }
}
