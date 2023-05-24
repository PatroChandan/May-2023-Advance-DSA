package Tree.BinarySearchTree.AssignmentQuestions.SearchInABST;

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

public class SearchInABST {
    static int searchInBST(Node root,int key) {
        // write your code here
        if(root == null) {
            return -1;
        }
        if(root.data == key) {
            return 1;
        }
        if(root.data < key) {
            return searchInBST(root.right, key);
        }
        return searchInBST(root.left, key);
    }
}
