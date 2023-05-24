package Tree.BinarySearchTree.AssignmentQuestions.BinarySearchTreeCreation;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTreeCreation {
    private static void printTree(Node root) {

    }

    public static void main(String[] args) {
        // Write your code here to create the tree
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.right = new Node(4);
        root.right.right = new Node(9);

        // pass the root node through printTree function
        printTree(root);
    }
}
