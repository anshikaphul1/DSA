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

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer>result=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(result.isEmpty() || result.get(result.size()-1)!=nums1[i]){
                    result.add(nums1[i]);
                }
                i++;
            j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            } 
            else j++;
        }
        int[]ans=new int[result.size()];
        for(int k=0;k<ans.length;k++){
            ans[k]=result.get(k);
        }
        return ans;
    }
}