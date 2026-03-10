class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int max=Integer.MIN_VALUE;
        int[] res=new int[2];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]>max){
                    max=mat[i][j];
                    res[0]=i;
                    res[1]=j;
                }
                else
                continue;
            }
        }
        return res;
    }
}