public class balancedBinaryTree_110 {
    class TreeNode {
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

    class Solution {
        public boolean isBalanced(TreeNode root) {
            return checkHeight(root) != -1;
        }

        private int checkHeight(TreeNode node) {
            if (node == null) {
                return 0;
            }

            int leftHeight = checkHeight(node.left);
            if (leftHeight == -1) return -1;

            int rightHeight = checkHeight(node.right);
            if (rightHeight == -1) return -1;

            if (Math.abs(leftHeight - rightHeight) > 1) {
                return -1;
            }

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static void main(String[] args) {
        balancedBinaryTree_110 program = new balancedBinaryTree_110();
        Solution solution = program.new Solution();

        TreeNode root1 = program.new TreeNode(3);
        root1.left = program.new TreeNode(9);
        root1.right = program.new TreeNode(20);
        root1.right.left = program.new TreeNode(15);
        root1.right.right = program.new TreeNode(7);
        System.out.println("Tree 1 Result (Is Balanced?): " + solution.isBalanced(root1));

        TreeNode root2 = program.new TreeNode(1);
        root2.left = program.new TreeNode(2);
        root2.left.left = program.new TreeNode(3);
        System.out.println("Tree 2 Result (Is Balanced?): " + solution.isBalanced(root2));
    }
}