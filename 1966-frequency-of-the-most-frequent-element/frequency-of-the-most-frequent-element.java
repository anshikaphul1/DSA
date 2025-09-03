class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        // int max=nums[nums.length-1];
        int l=0,r=0;
        int res=0;
        long total=0;
        while(r<nums.length){
            total+=nums[r];
            while((long)nums[r]*(r-l+1)>total+k){//invalid window use kar rhe hai mtlb if 3>5 to hi chalega or hum window ko shrink karenge
            total-=nums[l];
            l+=1;
        }
        res=Math.max(res,r-l+1);
            r+=1;
        }
        return (int)res;
    }
}