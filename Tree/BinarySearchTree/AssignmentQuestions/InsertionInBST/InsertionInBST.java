package Tree.BinarySearchTree.AssignmentQuestions.InsertionInBST;

class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

public class InsertionInBST {
    static Node insertInBST(Node root, int key) {
        // Your code here
        if(root == null) {
            root = new Node(key);
        }
        else {
            if(root.data < key) {
                root.right = insertInBST(root.right, key);
            }
            else if(root.data > key) {
                root.left = insertInBST(root.left, key);
            }
            else {

            }
        }

        return root;
    }
}
