package Tree.Traversal.LevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    static void levelOrder(Node root){
        //Enter your code here
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(root);

        while(!queue.isEmpty()) {
            Node currentNode = queue.poll();

            System.out.print(currentNode.data + " ");

            if(currentNode.left != null) {
                queue.add(currentNode.left);
            }

            if(currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }
}
