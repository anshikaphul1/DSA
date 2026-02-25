class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    //     int low=1;
    //     // int max=0;
    //     int high=max(piles);
    //     // int high=Math.max(piles,max);
    //     // int ans=Integer.MAX_VALUE;
    //     while(low<=high){
    //         int mid=low+(high-low)/2;
    //         long totalhrs=calculatehrs(piles,mid);
    //         if(totalhrs<=h){
    //             // ans=mid;
    //             high=mid-1;
    //         }
    //         else{
    //             low=mid+1;
    //         }
    //     }
    //     return low;
    // }
    // public long calculatehrs(int[] piles,int mid){
    //     long totalhrs=0;
    //     for(int i=0;i<piles.length;i++){
    //         totalhrs+=Math.ceil((double)piles[i]/mid);
    //         // totalhrs+=(piles[i]+mid-1)/mid;
    //     }
    //     return totalhrs;
    // }
    // public int max(int[] arr){
    //     int maxi=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>maxi){
    //             maxi=arr[i];
    //         }
    //     }
    //     return maxi;



    int low=1;
    int high=0;
    for(int pile:piles){
        high=Math.max(high,pile);
    }
        while(low<high){
            int mid=low+(high-low)/2;
            long totalhr=0;
            for(int pile:piles){
                totalhr+=(pile+mid-1)/mid;
                if(totalhr>h) break;
            }
            if(totalhr>h){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
    return low;
    }
}