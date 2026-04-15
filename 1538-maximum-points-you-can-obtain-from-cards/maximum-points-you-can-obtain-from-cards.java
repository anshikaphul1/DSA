class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left=0;
        int right=0;
        // int sum=0;
        int maxi=0;
        for(int i=0;i<k;i++){
            left+=cardPoints[i];
        }
        maxi=left;
        int ridx=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            left-=cardPoints[i];
            right+=cardPoints[ridx];
            ridx--;
            maxi=Math.max(maxi,left+right);
        }
        // maxi=Math.max(maxi,left+right);
        return maxi;
    }
}