package Tree.AssignmentQuestions.BinaryTreeCreation;

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
public class BinaryTreeCreation {
    public static void main(String[] args) {
        // write your code here to create the tree
        Node root = new Node(1);
        Node leftChild = new Node(2);
        Node rightChild = new Node(3);

        root.left = leftChild;
        root.right = rightChild;

        // print out the values of the nodes
        System.out.print(root.value+ " ");
        System.out.print(root.left.value+ " ");
        System.out.print(root.right.value+ " ");
    }
}
