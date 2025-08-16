class Solution {
    public int removeElement(int[] nums, int val) {
        // int k=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=val){
        //         nums[k]=nums[i];
        //         k++;
        //     }
        // }
        // return k; //new length hai array ki ye without val


        // ArrayList se: chatgpt se dekha hai ye

        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        list.removeIf(n->n==val);
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return list.size();
    }
}