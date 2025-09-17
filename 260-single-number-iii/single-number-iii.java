class Solution {
    public int[] singleNumber(int[] nums) {
        // xor the elements in the whole array 
        int xor=0;
        for(int ele:nums){
            xor^=ele;
        }
            int pos=0;
            // 
            for(int i=0;i<32;i++){
                if(((xor>>i) & 1) ==1){
                    pos=i;
                    break;
                }
            }
            // yaha pe hum position pe ele ke basis pe set or unset wale groups ko divide kar rhe hai 
            int a=0,b=0;
            for(int ele:nums){
                // set wala group
                if(((ele>>pos) & 1)==1){
                    a=a^ele;
                }
                else{
                    b=b^ele;
                }
            }
            return new int[] {a,b};
        }
    }