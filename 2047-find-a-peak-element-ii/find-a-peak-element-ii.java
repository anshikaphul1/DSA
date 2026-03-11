class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        // int max=Integer.MIN_VALUE;
        // int[] res=new int[2];
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(mat[i][j]>max){
        //             max=mat[i][j];
        //             res[0]=i;
        //             res[1]=j;
        //         }
        //         else
        //         continue;
        //     }
        // }
        // return res;

        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=maxele(mat,mid);
            int left=mid-1>=0?mat[row][mid-1]:-1;
            int right=mid+1<n?mat[row][mid+1]:-1;
            if(mat[row][mid]>left && mat[row][mid]>right){
                return new int[]{row,mid};
            }
            else if(mat[row][mid]<left){
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return new int[]{-1,-1};
    }
     public int maxele(int[][]mat,int col){
            int n=mat.length;
            int index=-1;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(mat[i][col]>max){
                    max=mat[i][col];
                    index=i;
                }
            }
            return index;
        }
}