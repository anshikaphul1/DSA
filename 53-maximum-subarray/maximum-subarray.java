class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        // int sum=0;
        // int maxi=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         // int sum=0;
        //         sum+=nums[j];
        //         // for(int k=i;k<=j;k++){
        //         //     sum+=nums[k];
        //         // }
        //         maxi=Math.max(sum,maxi);
        //     }
        // }
        // maxi=Math.max(sum,maxi);
        // return maxi;
        int sum=0;
        int maxi=nums[0];
        for(int i=0;i<n;i++){
            sum+=nums[i];
             maxi=Math.max(maxi,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}