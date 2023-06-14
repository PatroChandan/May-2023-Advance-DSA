package Tree.Traversal.LevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfABinaryTree {
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

    static int getMaxWidth(Node root) {
        // Your code here
        // You can create your helper function or
        // class as your convenience
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        int maxWidth = 0;
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            maxWidth = Math.max(maxWidth, levelSize);

            for(int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();

                if(currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }

        return maxWidth;
    }
}
