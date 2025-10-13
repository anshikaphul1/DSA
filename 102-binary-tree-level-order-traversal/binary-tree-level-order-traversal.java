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
        if(res.size()==level) //har ek level ko dekh re hai jaise pehle 3 wala fir 9 or 20 wala //basically kisi level ko first time visit krne ke liye
        res.add(new ArrayList<>());//usse new ArrayList bna kr add kar dete hai
        res.get(level).add(root.val);//result.get se hame 1d array mila jitne bhi hai or add se add ho jaate hai
        helper(root.left,res,level+1);
        helper(root.right,res,level+1);

    }
}