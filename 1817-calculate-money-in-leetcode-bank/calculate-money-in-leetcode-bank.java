class Solution {
    public int totalMoney(int n) {
        int total=0;
        int monday=1;
        int nextweek=0;
        for(int i=1;i<=n;i++){
            total+=monday;
            monday++;
            if(i%7==0){
                nextweek++;
                monday = 1+nextweek;
            }
        }
        return total;
    }
}