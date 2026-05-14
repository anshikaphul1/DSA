class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<m*k) return -1;
        int low=mi(bloomDay);
        int high=maxi(bloomDay);
        int result=-1;
        // for(int i=low;i<=high;i++){
        //     if(isitpossible(bloomDay,i,m,k)==true){
        //         return i;
        //     }
        // }
        //  return -1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(isitpossible(bloomDay,mid,m,k)==true){
             result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
    public int mi(int[]arr){
        int mini=arr[0];
        for(int i=0;i<arr.length;i++){
            mini=Math.min(mini,arr[i]);
        }
        return mini;
    }
    public int maxi(int[]wt){
        int max=wt[0];
        for (int i = 0; i < wt.length; i++) {
            max = Math.max(max, wt[i]);
        }
        return max;
    }
    public boolean isitpossible(int[]arr,int days,int m,int k){
        int count=0;
        int noofb=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=days)
            {
                count++;
            }
            else{
                noofb+=count/k;
                count=0;
            }
        }
            noofb+=count/k;
          if(noofb>=m){
            return true;
          }
          return false; 
    }
}