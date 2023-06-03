package Tree.BinarySearchTree.AssignmentQuestions.InClass;

public class PrintBSTInSortedOrder {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void printBSTInSortedOrder(Node node) {
        // Write your code here
        if(node != null) {
            printBSTInSortedOrder(node.left);
            System.out.print(node.data + " ");
            printBSTInSortedOrder(node.right);
        }
    }
}
