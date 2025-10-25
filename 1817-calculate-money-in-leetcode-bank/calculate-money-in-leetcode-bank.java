class Solution {
    public int totalMoney(int n) {
        int total=0;
        int day=1;
        int nextweek=0;
        for(int i=1;i<=n;i++){
            total+=day;
            day++;
            if(i%7==0){
                nextweek++;
                day = 1+nextweek;
            }
        }
        return total;
    }
}