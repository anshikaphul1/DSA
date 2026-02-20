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

        // HashSet<Integer>set=new HashSet<>();
        // Arrays.sort(nums);
        // if(nums.length==0) return 0;
        // set.add(nums[0]);
        // int count=1;
        // int longest=1;
        // for(int i=1;i<nums.length;i++){
        //     if(set.contains(nums[i])) continue;
        //     set.add(nums[i]);
        //     if(nums[i]==nums[i-1]) continue;
        //     else if(nums[i]==nums[i-1]+1) count++;
        //     else count=1;
        //     longest=Math.max(longest,count);
        // }
        // return longest;
    // if(nums.length==0) return 0;
    //     Arrays.sort(nums);
    //     int longest=1,currcnt=0,lastsmall=Integer.MIN_VALUE;
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]-1==lastsmall){
    //             currcnt++;
    //             lastsmall=nums[i];
    //         }
    //         else if(nums[i]==lastsmall){
    //             continue;
    //         }
    //         else if(nums[i]!=lastsmall){
    //             // largest=Math.max(largest,currcnt);
    //             currcnt=1;
    //             lastsmall=nums[i];
    //         }
    //         longest=Math.max(longest,currcnt);
    //     }
    //     return longest;


    if(nums.length==0) return 0;
    int longest=1;
    // int cnt=0;
    HashSet<Integer>set=new HashSet<>();
    for(int num:nums){
        set.add(num);
    }
    for(int n:set){
        if(!set.contains(n-1)){
            int cnt=1;
            int x=n;
        
        while(set.contains(x+1)){
            cnt++;
            x++;
        }
        longest=Math.max(longest,cnt);
        }
    }
    return longest;
    }
}