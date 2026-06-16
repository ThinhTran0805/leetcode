import java.util.LinkedList;
import java.util.Queue;

public class maximumDepth_104 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        public int maxDepthDFS(TreeNode root) {
            if (root == null) return 0;
            return Math.max(maxDepthDFS(root.left), maxDepthDFS(root.right)) + 1;
        }

        public int maxDepthBFS(TreeNode root) {
            if (root == null) return 0;

            int level = 0;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode currentNode = queue.poll();
                    if (currentNode.left != null) queue.offer(currentNode.left);
                    if (currentNode.right != null) queue.offer(currentNode.right);
                }
                level++;
            }
            return level;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();

        int depthDFS = solution.maxDepthDFS(root);
        System.out.println("--- IntelliJ Execution Results ---");
        System.out.println("Max depth using Recursion (DFS): " + depthDFS);

        int depthBFS = solution.maxDepthBFS(root);
        System.out.println("Max depth using Iteration (BFS): " + depthBFS);
    }
}