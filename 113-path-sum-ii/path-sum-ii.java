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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> currentPath=new ArrayList<>();
        dfs(root,targetSum,0,res,currentPath);
        return res;
    }

    void dfs(TreeNode root,int targetSum,int sum,ArrayList<List<Integer>> res,ArrayList<Integer> currentPath){

        if(root==null) return ;
        
        sum+=root.val;
        currentPath.add(root.val);
        if(root.left==null && root.right==null  && sum==targetSum){
            res.add(new ArrayList<>(currentPath));
        }
        dfs(root.left,targetSum,sum,res,currentPath);
        dfs(root.right,targetSum,sum,res,currentPath);
       currentPath.remove(currentPath.size()-1);        
    }
        
    
}