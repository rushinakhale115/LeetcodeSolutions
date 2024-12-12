import java.util.ArrayList;
import java.util.List;
public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        // Create a sample binary tree
        // Example tree:
        //       1
        //        \
        //         2
        //        /
        //       3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Create a Solution object and call inorderTraversal
        Solution solution = new Solution();
        List<Integer> result = solution.inorderTraversal(root);

        // Print the result
        System.out.println("Inorder Traversal: " + result);
    }
}

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        return list;
    }

    void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left, list); // Traverse the left subtree
        list.add(node.val); // Visit the root node
        inorderTraversal(node.right, list); // Traverse the right subtree
    }
}