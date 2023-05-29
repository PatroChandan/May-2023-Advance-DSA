package Tree.BinaryTree.AssignmentQuestions.InClass;
public class BinaryTreeCreationII {
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        // write your code here to create the tree
        Node root = new Node(1);
        Node rootLeft = new Node(2);
        Node rootRight = new Node(3);

        root.left = rootLeft;
        root.right = rootRight;

        Node rootLeftLeft = new Node(5);
        Node rootLeftRight = new Node(6);

        rootLeft.left = rootLeftLeft;
        rootLeft.right = rootLeftRight;


        System.out.print(root.value+ " ");
        System.out.print(root.left.value+ " ");
        System.out.print(root.left.left.value+ " ");
        System.out.print(root.left.right.value+ " ");
        System.out.print(root.right.value+ " ");
    }
}

