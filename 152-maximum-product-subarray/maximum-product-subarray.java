class Solution {
    public int maxProduct(int[] nums) {
        int maxi=-9999;
        int prod=1;
        for(int i=0;i<nums.length;i++){
            // int prod=0;
            prod*=nums[i];
            maxi=Math.max(maxi,prod);
            // if(prod<0){
            //     prod=0;
            // }
            if(prod==0){
                prod=1;
            }
            // prod*=nums[i];
            // maxi=Math.max(maxi,prod);
        }
        prod=1;
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            prod*=nums[i];
            maxi=Math.max(maxi,prod);
            if(prod==0) prod=1;
        }
        return maxi;
    }
}