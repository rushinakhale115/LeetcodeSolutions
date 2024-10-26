class Solution3 {
    int[] po = new int[100001];
    int[] po_ = new int[100001];
    int maxH = 0;

    private void preOrder(TreeNode root, int height) {
        // edge
        if (root == null) {
            return;
        }

        po[root.val] = maxH;
        maxH = Math.max(maxH, height);
        preOrder(root.left, height + 1);
        preOrder(root.right, height + 1);
    }

    private void postOrder(TreeNode root, int height) {
        // edge
        if (root == null) {
            return;
        }

        po_[root.val] = maxH;
        maxH = Math.max(maxH, height);
        postOrder(root.right, height + 1);
        postOrder(root.left, height + 1);
    }

    public int[] treeQueries(TreeNode root, int[] queries) {
        preOrder(root, 0);
        maxH = 0;
        postOrder(root, 0);

        int[] res = new int[queries.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = Math.max(po[queries[i]], po_[queries[i]]);
        }
        return res;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class HeightofBinaryTreeAfterSubtreeRemovalQueries {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        // Define the queries for which we want to check heights
        int[] queries = {1, 2, 3, 4, 5, 6};

        // Instantiate the Solution class and call the treeQueries method
        Solution solution = new Solution();
        int[] result = solution.treeQueries(root, queries);

        // Print the results
        System.out.println("Query results for node heights:");
        for (int i = 0; i < queries.length; i++) {
            System.out.println("Node " + queries[i] + ": " + result[i]);
        }
    }
}
