/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
          ArrayList<TreeNode> p1 = nodeToRootPath(root, p);
          ArrayList<TreeNode> p2 = nodeToRootPath(root, q);

          int i=p1.size()-1;
          int j=p2.size()-1;

          while(i >= 0 && j >= 0 && p1.get(i) == p2.get(j)) {
              i--;
              j--;
            }
          TreeNode lca=p1.get(i+1);

          return lca;
    }
    
    public static ArrayList<TreeNode> nodeToRootPath(TreeNode node,TreeNode data_node){
        
          if (node == null) {
            return new ArrayList<>();
          }
          if (node == data_node) {
            ArrayList list = new ArrayList<>();
            list.add(node);
            return list;
          }
          ArrayList llist = nodeToRootPath(node.left, data_node);
          if (llist.size() > 0) {
            llist.add(node);
            return llist;
          }
          ArrayList rlist = nodeToRootPath(node.right, data_node);
          if (rlist.size() > 0) {
            rlist.add(node);
            return rlist;
          }
        
          return new ArrayList<>();
    }
    
}
