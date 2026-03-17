class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // HashSet<Integer>set=new HashSet<>();
        // for(int nums:nums1){
        //     set.add(nums);
        // }
        // HashSet<Integer>result=new HashSet<>();
        // for(int num:nums2){
        //     if(set.contains(num)){
        //         result.add(num);
        //     }
        // }
        // int[]ans=new int[result.size()];
        // int i=0;
        // for(int num:result){
        //     ans[i++]=num;
        // }
        // return ans;

        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // List<Integer>result=new ArrayList<>();
        // int i=0,j=0;
        // while(i<nums1.length && j<nums2.length){
        //     if(nums1[i]==nums2[j]){
        //         if(result.isEmpty() || result.get(result.size()-1)!=nums1[i]){
        //             result.add(nums1[i]);
        //         }
        //         i++;
        //     j++;
        //     }
        //     else if(nums1[i]<nums2[j]){
        //         i++;
        //     } 
        //     else j++;
        // }
        // int[]ans=new int[result.size()];
        // for(int k=0;k<ans.length;k++){
        //     ans[k]=result.get(k);
        // }
        // return ans;

        Arrays.sort(nums1);
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums2){
            if(binary(nums1,num)){
                set.add(num);
            }
        }
        int[] ans=new int[set.size()];
        int i=0;
        for(int num:set){
            ans[i++]=num;
        }
        return ans;
    }
    public boolean binary(int[]arr,int target){
        int l=0;
        int r=arr.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]==target) return true;
            else if(arr[mid]<target) l=mid+1;
            else r=mid-1;
        }
        return false;
    }
}