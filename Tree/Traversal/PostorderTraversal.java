package Tree.Traversal;

public class PostorderTraversal {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void postorderTraversal(Node node) {
        // Write your code here
        if(node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }
}
