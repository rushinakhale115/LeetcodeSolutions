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
    public boolean hasPathSum(TreeNode root, int targetSum) {
      if(root==null) return false;
      if(root.left==null && root.right==null) return root.val==targetSum;
      return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);  
    }
}

public class Pathsum {
    public static void main(String[] args) {
        // Construct the binary tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        // Create a Solution object
        Solution solution = new Solution();

        // Call hasPathSum and print the result
        boolean result = solution.hasPathSum(root, targetSum);
        System.out.println("Has path sum " + targetSum + ": " + result);
    }
}
