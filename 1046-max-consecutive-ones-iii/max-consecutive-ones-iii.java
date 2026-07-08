class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
        int mx = 0;
        int zerocount = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                zerocount++;
            }
            if(zerocount<k){
                 mx = Math.max(mx, j - i + 1);
                j++;
            }
            else if (zerocount == k) {
                mx = Math.max(mx, j - i + 1);
                j++;
            } else if (zerocount > k) {
                while (zerocount > k) {
                    if (nums[i] == 0) {
                        zerocount--;
                    }
                    i++;
                }
j++;
                // i++;
            }
            // j++;
        }
        return mx;
    }
}