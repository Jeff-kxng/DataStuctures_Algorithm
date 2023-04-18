package Adjacencylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Node>> arrayList;
    Graph (){
        arrayList = new ArrayList<>();
    }
    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        arrayList.add(currentList);
    }
    public boolean addEdge(int src, int dst){
        LinkedList<Node> currentList = arrayList.get(src);
        Node dstNode = arrayList.get(dst).get(0);
        for (Node node : currentList){
            if (node == dstNode){
                return true;
            }
        }
        return false;
    }
    public void checkEdge(int src, int dst){
    }
    public void print(){
        for (LinkedList<Node> currentList : arrayList){
            for (Node node : currentList){
                System.out.print(node.data + " -> ");
            }
        }
    }

}
