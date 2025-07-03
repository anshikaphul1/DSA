class Solution {
    public boolean isPalindrome(int x) {
        int revnum=0;
        int num=x;
        while(x>0){
            revnum=revnum*10+x%10;
            x/=10;
        }
        if(num==revnum){
            return true;
        }
        else
        return false;
    }
}