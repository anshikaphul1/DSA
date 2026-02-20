class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        // if(nums.length==0) return 0;
        // int count=1;
        // int longest=1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]) continue;
        //     else if(nums[i]==nums[i-1]+1) count++;
        //     else {
        //         longest=Math.max(longest,count);
        //         count=1;//reset krna hota hai pattern
        //     }
        // }
        // return Math.max(longest,count);

        HashSet<Integer>set=new HashSet<>();
        Arrays.sort(nums);
        if(nums.length==0) return 0;
        set.add(nums[0]);
        int count=1;
        int longest=1;
        for(int i=1;i<nums.length;i++){
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);
            if(nums[i]==nums[i-1]) continue;
            else if(nums[i]==nums[i-1]+1) count++;
            else count=1;
            longest=Math.max(longest,count);
        }
        return longest;
    }
}