class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long sum=0;
        long mx=0;
        Set<Integer> set=new HashSet<>();
        int i=0;
        for(int j=0;j<n;j++){
            // if(!set.contains(nums[j])){
            //     sum+=nums[j];
            //     set.add(nums[j]);
            // }
            // if(j-i+1==k){
            //     mx=Math.max(mx,sum);
            //     sum-=nums[i];
            //     set.remove(nums[i]);
            //     i++;
            // }
            // else{
            //     while(nums[i]!=nums[j]){
            //         sum-=nums[i];
            //         set.remove(nums[i]);
            //         i++;
            //     }
            //     j++;
            // }
            
            while(set.contains(nums[j])){
                set.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
            set.add(nums[j]);
            sum+=nums[j];
            if(j-i+1==k){
                mx=Math.max(mx,sum);
                set.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
        }
        return mx;
    }
}