package Adjacencylist;

public class Main {
    // Adjacency = An array / arrayList of linkedlists
    // each linkedlists has a unique nosde at the head
    // all adjacent neighbors to that node are added to that node's linkedlist
    // runtime complexity to check an edge : 0(v)
    // space complexity : 0 ( v + e)
    public static void main(String[] args) {
        // Adjacency = An array / arrayList of linkedlists
        // each linkedlists has a unique nosde at the head
        // all adjacent neighbors to that node are added to that node's linkedlist
        // runtime complexity to check an edge : 0(v)
        // space complexity : 0 ( v + e)
        Graph graph = new Graph();
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();
    }
}
