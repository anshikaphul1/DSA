class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // int n=cost.length;
        // int[]dp=new int[n];
        // dp[0]=cost[0];
        // dp[1]=cost[1];
        // // for(int i=2;i<n;i++){
        //     // dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        // // }
        
        // return Math.min(dp[n-1],dp[n-2]);

        
        int n=cost.length;
        int[] dp = new int[n + 1];   
        Arrays.fill(dp, -1);
        return mccs(n,cost,dp);
    }
    public int mccs(int n,int[]cost,int[]dp){
        if(n==0 || n==1) return 0;
         if (dp[n] != -1) return dp[n];
        int one=mccs(n-1,cost,dp)+cost[n-1];
        int two=mccs(n-2,cost,dp)+cost[n-2];
        dp[n]= Math.min(one,two);
        return dp[n];
    }
}