class Solution {
    public int daysneeded(int[]weights,int capacity){
        int days=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>capacity){
                days++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }
    public int maxi(int[]wt){
        int max=wt[0];
        for (int i = 0; i < wt.length; i++) {
            max = Math.max(max, wt[i]);
        }
        return max;
    }
    public int sumi(int[]wt){
        int sum=0;
        for(int i=0;i<wt.length;i++){
            sum+=wt[i];
        }
        return sum;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=maxi(weights);
        int high=sumi(weights);
        // for(int i=low;i<=high;i++){
        //     int days_need=daysneeded(weights,i);
        //     if(days_need<=days){
        //         return i;
        //     }
        // }
        // return high;


        while(low<=high){
            int mid=low+(high-low)/2;
            int days_need=daysneeded(weights,mid);
            if(days_need<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}