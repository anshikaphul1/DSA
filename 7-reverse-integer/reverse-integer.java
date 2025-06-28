class Solution {
    public int reverse(int x) {
        long revnum=0;
        while(x>0 || x<0)
        {
            revnum=revnum*10+x%10;
            x/=10;
        }
        return (revnum<Integer.MIN_VALUE|| revnum>Integer.MAX_VALUE)?0:(int) revnum;
        // while(x>0 || x<0){
        //     revnum=revnum*10+x%10;
        //     x/=10;
        // }
        // return (revnum<Integer.MIN_VALUE|| revnum>Integer.MAX_VALUE)?0:(int) revnum;
    }
}