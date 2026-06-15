import java.util.LinkedList;
import java.util.Queue;

public class symmetricTree_101 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            return isMirror(root.left, root.right);
        }

        private boolean isMirror(TreeNode t1, TreeNode t2) {
            if (t1 == null && t2 == null) {
                return true;
            }
            if (t1 == null || t2 == null || t1.val != t2.val) {
                return false;
            }
            return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode symmetricTree = new TreeNode(1);
        symmetricTree.left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        symmetricTree.right = new TreeNode(2, new TreeNode(4), new TreeNode(3));
        System.out.println("Check if the first tree is symmetric: " + solution.isSymmetric(symmetricTree));

        TreeNode asymmetricTree = new TreeNode(1);
        asymmetricTree.left = new TreeNode(2, null, new TreeNode(3));
        asymmetricTree.right = new TreeNode(2, null, new TreeNode(3));
        System.out.println("Check if the second tree is symmetric: " + solution.isSymmetric(asymmetricTree));
    }
}