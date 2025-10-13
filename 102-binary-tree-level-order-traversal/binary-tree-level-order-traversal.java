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
        // Queue<TreeNode> q=new ArrayDeque<>();
        // List<List<Integer>> res= new ArrayList<>();
        // if(root==null) return res;
        // q.offer(root);
        // while(!q.isEmpty())
        // {
        //     List<Integer> lvl=new ArrayList<>();
        //     int n=q.size();
        //     while(n!=0){

        //     TreeNode current=q.poll();
        //     // store this val of node
        //     lvl.add(current.val);
        //     if(current.left!=null) q.offer(current.left);
        //     if(current.right!=null) q.offer(current.right);
        //     n--;
        //     }
        //     res.add(lvl);
        // }
        // return res;





        // DFS

        List<List<Integer>> res=new ArrayList<>();
        helper(root,res,0);
        return res;
    }
    public void helper(TreeNode root,List<List<Integer>> res,int level)
    {
        if(root==null) return;
        if(res.size()==level) res.add(new ArrayList<>());
        res.get(level).add(root.val);//result.get se hame 1d array mila jitne bhi hai or add se add ho jaate hai
        helper(root.left,res,level+1);
        helper(root.right,res,level+1);

    }
}