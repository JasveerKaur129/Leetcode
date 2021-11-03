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
    public int sumNumbers(TreeNode root) {        
        int sum =0;
        int ans=findSum(root,sum,0);
        return ans;
    }
     public int findSum(TreeNode root,int sum,int val){
        if(root==null) return 0;
         
        val=(val*10)+root.val;
        if(root.left==null && root.right==null) return val;
         
        int left=findSum(root.left,sum,val);
        int right=findSum(root.right,sum,val);
         
        sum= left+right;
        return sum; 
     } 
}
