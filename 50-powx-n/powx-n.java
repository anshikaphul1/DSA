class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N==0) return 1.0;
        if(N<0){
            x=1/x;
            N=Math.abs(N);
        }
        double half=myPow(x,(int)(N/2));
        if(N%2==0) return half*half;
        else return x*half*half;
    }
}