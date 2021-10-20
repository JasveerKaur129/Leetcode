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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
      List<List<Integer>> level_nodes = new ArrayList<List<Integer>>();
    
    if(root==null){
        return level_nodes;
    }
    
    Stack<List<Integer>> node_stack = new Stack<List<Integer>>(); //as we want a reversed output

    Queue<TreeNode> nodes = new LinkedList<TreeNode>();
    nodes.add(root);
    
    while(nodes.size()!=0){

        int level_length = nodes.size();
        List<Integer> vals = new ArrayList<Integer>();

        while(level_length!=0){
            TreeNode temp = nodes.poll();

            if(temp.left!=null)nodes.add(temp.left);
            if(temp.right!=null)nodes.add(temp.right);

            vals.add(temp.val);
            level_length--;
        }

        node_stack.push(vals);
    }
    
    while(!node_stack.empty()){
        level_nodes.add(node_stack.pop());
    }
    
    return level_nodes;
    
   }   
}
