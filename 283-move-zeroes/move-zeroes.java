class Solution {
    // public void moveZeroes(int[] nums) {
    //     int l=0;//position jaha next non zero element will be moved
    //     for(int r=0;r<nums.length;r++){
    //         if(nums[r]!=0){
    //             int temp=nums[r];
    //             nums[r]=nums[l];
    //             nums[l]=temp;
    //             l++;
    //         }
    //     }
    // }
    public void moveZeroes(int[]nums){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        while(k<nums.length){
            nums[k]=0;
            k++;
        }
    }
}