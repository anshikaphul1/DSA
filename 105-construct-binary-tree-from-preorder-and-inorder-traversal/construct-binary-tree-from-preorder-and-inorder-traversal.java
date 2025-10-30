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
    int preindex=0;
    Map<Integer,Integer> inorderMap=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            inorderMap.put(inorder[i],i);
        }
        return build(inorder,preorder,0,inorder.length-1);
    }
    public TreeNode build(int[] inorder,int[] preorder,int start,int end){
        if(start>end) return null;
        int root=preorder[preindex++];
        TreeNode rootval=new TreeNode(root);
        int inindex=inorderMap.get(root);
        rootval.left=build(inorder,preorder,start,inindex-1);
        rootval.right=build(inorder,preorder,inindex+1,end);
        return rootval;
    }
}