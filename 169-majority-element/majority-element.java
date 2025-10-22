class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> nums_count = new HashMap<>();
        for(int n:nums){
            nums_count.put(n,nums_count.getOrDefault(n,0)+1);
        }
        int max=0;
        int major=0;
        for(Map.Entry<Integer,Integer> entry:nums_count.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                major=entry.getKey();
            }
        }
        return major;
    }
}