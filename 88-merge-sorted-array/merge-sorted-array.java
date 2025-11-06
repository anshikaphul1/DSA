class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // brute
        // int arr[]= new int[n+m];
        // int left=0;
        // int right=0;
        // int index=0;
        // while(left<m && right<n){
        //     if(nums1[left]<=nums2[right]){
        //     arr[index]=nums1[left];
        //     left++;
        //     index++;
        //     }
        //     else{
        //         arr[index]=nums2[right];
        //         right++;
        //         index++;
        //     }
        // }
        // while(left<m){
        //     arr[index++]=nums1[left++];
        // }
        // while(right<n){
        //     arr[index++]=nums2[right++];
        // }
        // for(int i=0;i<n+m;i++){
        //     if(i<m)
        //     nums1[i]=arr[i];
        //     else
        //     nums2[i-m]=arr[i];    
        // }






        // optimized

        int p1=m-1;
        int p2=n-1;
        int p=m+n-1;
        while(p2>=0){
            if(p1 >=0 && nums1[p1]>=nums2[p2]){
                nums1[p--]=nums1[p1--];
            }
            else{
                nums1[p--]=nums2[p2--];
            }
        }

    }
}