public class sameTree_100 {

    public static class TreeNode {
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

    static class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {

            if (p == null && q == null) return true;

            if (p == null || q == null || p.val != q.val) return false;

            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

    public static void main(String[] args) {

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);

        Solution solution = new Solution();
        boolean result = solution.isSameTree(p, q);

        System.out.println("Are the trees the same? " + result);
    }
}