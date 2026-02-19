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

        // int n=nums.length;
        // int[] res=new int[n];
        // int prod=1;
        // int zero=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==0){
        //        zero++;
        //     }
        //     else{
        //         prod*=nums[i];
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     if(zero>1){
        //         res[i]=0;
        //     }
        //     else if(zero==1){
        //        res[i]=(nums[i]==0)?prod:0;
        //     }
        //     else{
        //          res[i]=prod/nums[i];
        //     }
        // }
        // return res;

        int n=nums.length;
        int[] res=new int[n];
        int[] pref=new int[n];
        int[] suff=new int[n];
        pref[0]=1;
        suff[n-1]=1;
        for(int i=1;i<n;i++){
            pref[i]=nums[i-1]*pref[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suff[i]=nums[i+1]*suff[i+1];
        }
        for(int i=0;i<n;i++){
            res[i]=pref[i]*suff[i];
        }
        return res;
    }
}