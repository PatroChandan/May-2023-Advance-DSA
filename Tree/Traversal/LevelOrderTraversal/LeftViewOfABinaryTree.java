package Tree.Traversal.LevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfABinaryTree {
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
    private static void printLeftView(Node root) {
        // Your Code goes here
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();

            for(int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();

                if(i == 0) {
                    System.out.print(currentNode.data + " ");
                }

                if(currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
    }
}
