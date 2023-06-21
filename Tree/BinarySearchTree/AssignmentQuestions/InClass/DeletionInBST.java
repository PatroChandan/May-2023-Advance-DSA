package Tree.BinarySearchTree.AssignmentQuestions.InClass;

public class DeletionInBST {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }

    private static int getInorderPredecessor(Node node) {
        int value = node.data;

        while(node.right != null) {
            value = node.right.data;
            node = node.right;
        }

        return value;
    }

    public static Node deleteInBST(Node root, int value) {
        // Your code here
        if(root == null) {
            return root;
        }

        if(value < root.data) {
            root.left = deleteInBST(root.left, value);
        }
        else if(value > root.data) {
            root.right = deleteInBST(root.right, value);
        }
        else {
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }
            else {
                int inorderPredecessor = getInorderPredecessor(root.left);
                root.data = inorderPredecessor;

                root.left = deleteInBST(root.left, inorderPredecessor);
            }
        }

        return root;
    }
}
