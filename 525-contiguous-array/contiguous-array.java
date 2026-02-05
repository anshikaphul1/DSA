class Solution {
    public int findMaxLength(int[] nums) {
        int currsum=0;
        int result=0;
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            currsum+=(nums[i]==1)?1:-1;
            if(map.containsKey(currsum)){
                result=Math.max(result,i-map.get(currsum));

            }
            else{
                map.put(currsum,i);
            }
        }
        return result;
    }
}