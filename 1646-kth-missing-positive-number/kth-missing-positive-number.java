class Solution {
    public int findKthPositive(int[] nums, int k) {
        // int num=1;
        // int i=0;
        // while(i<nums.length && k>0){
        //     if(nums[i]==num){
        //         i++;
        //     }
        //     else{
        //         k--;
        //     }
        //     num++;
        // }
        // while(k-->0){
        //     num++;
        // }
        // return num-1;

        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int miss=nums[mid]-(mid+1);
            if(miss<k){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return l+k;
    }
}