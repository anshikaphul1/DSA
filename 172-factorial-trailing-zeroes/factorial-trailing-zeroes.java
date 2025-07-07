class Solution {
    public int trailingZeroes(int n) {
        // int fact=1;
        // for(int i=2;i<=n;i++)
        //     fact=fact*i;
        // int res=0;
        // while(fact%10==0){
        //     res++;
        //     fact/=10;
        // }
        // return res;

         int count = 0;
        while(n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }
}