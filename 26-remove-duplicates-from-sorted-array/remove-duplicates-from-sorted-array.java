class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]>nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
       return i+1;
    }
}