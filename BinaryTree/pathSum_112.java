public class pathSum_112 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

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
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return false;
            }

            targetSum -= root.val;

            if (root.left == null && root.right == null) {
                return targetSum == 0;
            }

            return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);

        Solution solution = new Solution();
        int targetSum = 20; // 5 -> 4 -> 11 (= 20)

        boolean result = solution.hasPathSum(root, targetSum);
        System.out.println("Kết quả: " + result); // True
    }
}