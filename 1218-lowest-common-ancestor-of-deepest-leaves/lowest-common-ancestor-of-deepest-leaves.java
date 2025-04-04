/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     public TreeNode lcaDeepestLeaves(TreeNode root) {
        return dfs(root).lca;
    }

    private Result dfs(TreeNode node) {
        if (node == null) {
            return new Result(null, 0);
        }

        Result left = dfs(node.left);
        Result right = dfs(node.right);

        if (left.depth > right.depth) {
            return new Result(left.lca, left.depth + 1);
        } else if (right.depth > left.depth) {
            return new Result(right.lca, right.depth + 1);
        } else {
            return new Result(node, left.depth + 1);
        }
    }

    private static class Result {
        TreeNode lca;
        int depth;

        Result(TreeNode lca, int depth) {
            this.lca = lca;
            this.depth = depth;
        }
    }
}