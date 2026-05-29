class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currmax=nums[0];
        int currmin=nums[0];
        int maxsum=nums[0];
        int minsum=nums[0];
        int total=nums[0];
        for(int i=1;i<nums.length;i++){
            currmax=Math.max(currmax+nums[i],nums[i]);
            maxsum=Math.max(maxsum,currmax);
            currmin=Math.min(currmin+nums[i],nums[i]);
            minsum=Math.min(minsum,currmin);
            total+=nums[i];
        }
        int circle=total-minsum;
        if(circle==0){
            return maxsum;
        }
        return Math.max(circle,maxsum);
    }
}