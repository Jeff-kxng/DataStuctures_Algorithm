package BinaryTree;

public class BinarySearchTree {
    Node root;
    public void insert(Node node) {
        root = insertHelper(root, node);
    }
    private Node insertHelper(Node root, Node node){
        int data = node.data;
        if (root == null){
            root = node;
            return root;
        } else if (data < root.data){
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }
    public void display(){
        diplayHepler(root);
    }
    public boolean diplayHepler(Node root) {
        if (root != null) {
            diplayHepler(root.left);
            System.out.println(root.data);
            diplayHepler(root.right);
        }
        return false;
    }
    public boolean search(int data){
        return searchHelper(root, data);
    }
    private boolean searchHelper(Node root, int data){
        if (root == null){
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }
    public void remove(int data){
        if (search(data)){
            removeHeper(root, data);
        } else {
            System.out.println(data + "Could not be found");
        }
    }
    public Node removeHeper(Node root, int data){
        if (root == null){
            return  root;
        } else if (data < root.data) {
            root.left = removeHeper(root.left, data);
        } else if (data > root.data) {
            root.right = removeHeper(root.right, data);
        } else {
            if (root.left == null && root.right == null){
                root = null;
            } else if (root.right != null) {
                root.data = sucessor(root);
                root.right = removeHeper(root.right, root.data);
            } else {
                root.data = predecessor(root);
                root.left = removeHeper(root.left, root.data);
            }
        }
        return root;
    }
    private int sucessor(Node root){
        root = root.right;
        while (root.left != null){
            root = root.left;
        }
        return root.data;
    }
    private int predecessor(Node root){
        root = root.left;
        while (root.right != null){
            root = root.right;
        }
        return root.data;
    }
}

