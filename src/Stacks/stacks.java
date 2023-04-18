package Stacks;

import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Minecraf");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Jeff");
        stack.push("FFVI");
        // String myFame = stack.pop();
        // System.out.println(stack.peek());
        // System.out.println(stack.search("Jeff"));
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
