class Solution {
    public boolean hasAlternatingBits(int n) {
       int digit=n^(n>>1);
       return (digit &(digit+1))==0;
    }
}