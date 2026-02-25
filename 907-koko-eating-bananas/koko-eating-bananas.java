class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);
        // int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            long totalhrs=calculatehrs(piles,mid);
            if(totalhrs<=h){
                // ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public long calculatehrs(int[] piles,int mid){
        long totalhrs=0;
        for(int i=0;i<piles.length;i++){
            totalhrs+=Math.ceil((double)piles[i]/mid);
            // totalhrs+=(piles[i]+mid-1)/mid;
        }
        return totalhrs;
    }
    public int max(int[] arr){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
}