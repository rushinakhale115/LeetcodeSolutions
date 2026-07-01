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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //your code goes here
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        boolean LeftToRight=true;

        while(!q.isEmpty()){
            int len=q.size();
            List<Integer> level = new ArrayList<>();

            for(int i=0;i<len;i++){
            TreeNode node=q.poll();

            if(LeftToRight){
                level.add(node.val);
            }
            else{
                level.add(0,node.val);
            }
            if(node.left!=null){
                q.offer(node.left);
            }
            if(node.right!=null){
                q.offer(node.right);
            }
            }
            res.add(level);
            LeftToRight=!LeftToRight;

           
        }
        return res;
        }
        


    }