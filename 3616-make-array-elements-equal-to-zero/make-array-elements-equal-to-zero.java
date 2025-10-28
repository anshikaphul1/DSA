class Solution {
    public int countValidSelections(int[] nums) {
        int curr=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
        // move right
        if(zero(nums.clone(),i,1))
        curr++;
        // move left
        if(zero(nums.clone(),i,-1))
        curr++;
        }
        }
        return curr;
    }
    public boolean zero(int[] arr,int curr,int dir){
        int n=arr.length;
        while(curr>=0 && curr<n){
            if(arr[curr]==0){
                curr+=dir;
            }
            else{
                arr[curr]--;
                dir=-dir;
                curr+=dir;
            }
        }
        for(int x:arr){
            if(x!=0){
                return false;
            }
        }
        return true;
    }
}