package Tree.BinarySearchTree.AssignmentQuestions.PostClass;

public class CheckForBST {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }

    boolean isBSTHelper(Node node, Integer min, Integer max) {
        if(node == null) {
            return true;
        }

        if(node.data < min || node.data > max) {
            return false;
        }

        boolean leftStatus = isBSTHelper(node.left, min, node.data - 1);
        boolean rightStatus = isBSTHelper(node.right, node.data + 1, max);

        return (leftStatus && rightStatus);
    }

    boolean isBST(Node root) {
        // code here
        return isBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
