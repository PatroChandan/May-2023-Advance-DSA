package Tree.BinarySearchTree.AssignmentQuestions.InClass;

public class DeletingANodeWith1Or0ChildInBST {
    class Node {
        int data;
        Node left, right;
        public Node(int d)
        {
            data = d;
            left = right = null;
        }
    }
    static Node deleteFromBST(Node root,int x) {
        //Write your code here
        if(root == null) {
            return root;
        }

        if(x < root.data) {
            root.left = deleteFromBST(root.left, x);
        }
        else if(x > root.data) {
            root.right = deleteFromBST(root.right, x);
        }
        else {
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }
        }

        return root;
    }
}
