public class convertSortedArrayToBST_108 {

    static class TreeNode {
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

    public static class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums == null || nums.length == 0) {
                return null;
            }
            return constructBSTRecursive(nums, 0, nums.length - 1);
        }

        private TreeNode constructBSTRecursive(int[] nums, int left, int right) {
            if (left > right) {
                return null;
            }

            int mid = left + (right - left) / 2;
            TreeNode root = new TreeNode(nums[mid]);

            root.left = constructBSTRecursive(nums, left, mid - 1);
            root.right = constructBSTRecursive(nums, mid + 1, right);

            return root;
        }

        private void printInOrder(TreeNode node) {
            if (node == null) {
                return;
            }
            printInOrder(node.left);
            System.out.print(node.val + " ");
            printInOrder(node.right);
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = solution.sortedArrayToBST(nums);

        System.out.print("In-order traversal of the constructed BST: ");
        solution.printInOrder(root);
    }
}