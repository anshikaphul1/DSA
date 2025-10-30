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
    int postIndex;
    Map<Integer,Integer> inorderMap=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            inorderMap.put(inorder[i],i);
        }
        return build(inorder,postorder,0,postorder.length-1);
    }
    public TreeNode build(int[] inorder,int[]postorder,int startIdx,int endIdx){
        if(startIdx>endIdx) return null;
        // current root nikalne ke liye
        int root=postorder[postIndex--];
        TreeNode rootval=new TreeNode(root);
        int inIndex=inorderMap.get(root);
        rootval.right=build(inorder,postorder,inIndex+1,endIdx);
        rootval.left=build(inorder,postorder,startIdx,inIndex-1);
        return rootval;
    }
}