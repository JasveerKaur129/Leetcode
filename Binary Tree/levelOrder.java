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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list= new ArrayList<>();
        Queue<TreeNode> nq=new ArrayDeque<>();
        List<Integer> innerList=new ArrayList<>();
        
        if(root==null){ 
            return list;
        }
        nq.add(root);
        
      
        while(nq.size()!=0){
          int count= nq.size();
          
          for(int i=0;i<count;i++){
             TreeNode rm=nq.remove();
             innerList.add(rm.val);
              
              if(rm.left!=null){
                  nq.add(rm.left);
              }
              if(rm.right!=null){
                  nq.add(rm.right);
              }
           }
          
         list.add(innerList);
         innerList=new ArrayList<>();
       }
        return list;
    }    
}
