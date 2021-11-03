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
        int val=0;
        return findTargetSum(root,val,targetSum);
    }
     public boolean findTargetSum(TreeNode root,int val,int targetSum){
         
         if(root==null){
             return false;
         }
         val=val+root.val;
         
         //if reached to leaf node check whether val equal to targetSum or not
         if(root.left==null&&root.right==null){
            if(val==targetSum){
             return true;
             }else{
                return false;
            }
         }
         boolean left=findTargetSum(root.left,val,targetSum);
         boolean right=findTargetSum(root.right,val,targetSum);
         
         if(left==true||right==true){
             return true;
         }else{
             return false;
         }
     }
}
