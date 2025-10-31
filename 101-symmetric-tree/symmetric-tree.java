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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return areMirror(root.left,root.right);
    }
    public boolean areMirror(TreeNode root1,TreeNode root2){
       
        if(root1==null && root2==null) return true;
         if(root1==null || root2==null) return false;
        if(root1.val!=root2.val) return false;
        else
        return (areMirror(root1.left,root2.right)&& areMirror(root1.right,root2.left))?true:false;
    }
}