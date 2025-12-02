class Solution {
    public int findLength(int[] nums1, int[] nums2) {
       int n=nums1.length;
       int m=nums2.length;
       int ans=0;
       dp = new int[n+1][m+1];
       for(int[] arr: dp){
        Arrays.fill(arr, -1);
       }
       for(int i=0;i<=n;i++){
        for(int j=0;j<=m;j++){
            ans=Math.max(ans,helper(nums1,nums2,i,j,n-1,m-1));
        }
       }
       return ans;
    }
    int[][] dp;
    int helper(int[] nums1,int[]nums2,int i,int j,int n,int m){
        if(i>n || j>m) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(nums1[i]==nums2[j]) return dp[i][j]=1+helper(nums1,nums2,i+1,j+1,n,m);
        return 0;
    }
}