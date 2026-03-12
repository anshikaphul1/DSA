class Solution {
    public int division(int[]nums,int div){
        int sum=0;
        for(int num:nums){
            // sum+=Math.ceil((double)num/div);
            sum+=(num+div-1)/div;
        }
        return sum;
    }


    public int smallestDivisor(int[] nums, int threshold) {
        // brute

        // int maxi=Integer.MIN_VALUE;
        // for(int num: nums){
        //     maxi=Math.max(maxi,num);
        // }
        // for(int i=1;i<=maxi;i++){
        //     int sum=0;
        //     for(int num:nums){
        //         // sum+=(int) Math.ceil((double)num/i);
        //         sum+=(num+i-1)/i;
        //     }
        //     if(sum<=threshold)
        //     {
        //         return i;
        //     }
        // }
        // return -1;
        // brute
    //     for(int i=1;i<=maxi;i++){
    //         int sum=0;
    //         for(int j=0;j<nums.length;j++){
    //             sum+=(int)Math.ceil((double)nums[j]/i);
    //         }
    //         if(sum<=threshold){
    //             return i;
    //         }
    //     }
    // return -1;


        int low=1;
        // int high=0;
        int maxi=Integer.MIN_VALUE;
        for(int num:nums){
        maxi= Math.max(num,maxi);
        }
        int high=maxi;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(division(nums,mid)<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}