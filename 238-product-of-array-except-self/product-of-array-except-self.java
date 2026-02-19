class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int n=nums.length;
        // int[] res=new int[n];
        // for(int i=0;i<n;i++){
        //     int prod=1;
        //     for(int j=0;j<n;j++){
        //         if(i!=j){
        //             prod*=nums[j];
        //         }
        //     }
        //     res[i]=prod;
        // }
        // return res;

        int n=nums.length;
        int[] res=new int[n];
        int prod=1;
        int zero=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
               zero++;
            }
            else{
                prod*=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(zero>1){
                res[i]=0;
            }
            else if(zero==1){
               res[i]=(nums[i]==0)?prod:0;
            }
            else{
                 res[i]=prod/nums[i];
            }
        }
        return res;
    }
}