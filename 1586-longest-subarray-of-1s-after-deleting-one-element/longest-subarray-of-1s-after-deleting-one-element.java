class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int maxlength = 0;
        int zerocount = 0;
        int k=1;
        while (right < nums.length) {
            if(nums[right]==0){
                zerocount++;
            }
        while (zerocount > k) {
            if(nums[left]==0){
           zerocount--;
           }
           left++;
        }
        maxlength=Math.max(maxlength,right-left);
        right++;
        }
        return maxlength;
    }
}