package Tree.BinaryTree.AssignmentQuestions.PostClass.MirrorTrees;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class MirrorTrees {
    public static boolean isMirror(Node root1, Node root2) {
        // Your code here
        // return true or false if both trees are identical or not
        if(root1 == null && root2 == null) {
            return true;
        }
        if(root1 == null || root2 == null) {
            return false;
        }

        if(root1.data != root2.data) {
            return false;
        }

        boolean isLeftMirror = isMirror(root1.left, root2.right);
        boolean isRightMirror = isMirror(root1.right, root2.left);

        return (isLeftMirror && isRightMirror);
    }
}
