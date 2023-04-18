package Recurision;

import static java.nio.file.Files.walk;

public class Main {
    public static void main(String[] args) {
        walk(5);
    }

    private static void walk(int steps) {
       // for (int i = 0; i < steps; i++)
          //  System.out.println("You take a steps : ");
        if (steps < 1) return; // base case
        System.out.println("You take a steps!!");
        walk(steps -1);
    }
}
