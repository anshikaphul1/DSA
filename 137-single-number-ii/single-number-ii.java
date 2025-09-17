class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<32;i++){
            // mask ka kaam set bit check karta hai
            int mask=(1<<i);
            int onecount=0;
            int zerocount=0;
            for(int ele:nums){
                if((ele&mask)==0){
                    zerocount++;
                }
                else{
                    onecount++;
                }
            }
            if((onecount%3)!=0){
                // or issi liye kiya kyuki 1 hi bit set hai na
                ans=(ans|mask);
            }
        }
        return ans;
    }
}