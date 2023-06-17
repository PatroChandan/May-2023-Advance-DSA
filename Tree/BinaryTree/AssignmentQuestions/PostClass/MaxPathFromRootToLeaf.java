package Tree.BinaryTree.AssignmentQuestions.PostClass;

public class MaxPathFromRootToLeaf {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public long rootToLeaf(TreeNode root){
        if(root == null) {
            return 0;
        }

        long left = rootToLeaf(root.left);
        long right = rootToLeaf(root.right);

        return (Math.max(left, right) + root.val);
    }
}
