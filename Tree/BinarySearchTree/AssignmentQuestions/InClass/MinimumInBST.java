package Tree.BinarySearchTree.AssignmentQuestions.InClass;

public class MinimumInBST {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left=null;
            right=null;
        }
    }

    static int minValue(Node node) {
        // Your code here
        if(node == null) {
            return -1;
        }

        Node temp = node;
        while(temp.left != null) {
            temp = temp.left;
        }

        return temp.data;
    }
}
