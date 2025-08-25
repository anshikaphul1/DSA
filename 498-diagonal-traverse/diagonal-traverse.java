// class Solution {
//     public int[] findDiagonalOrder(int[][] mat) {
//         if(mat.length==0 ||mat[0].length==0)
//         return new int[0];
//         int i=0;
//         int m=mat.length;//no.of rows
//         int n=mat[0].length;//no.of columns
//         int[]arr=new int[m*n];
//         int row=0;
//         int col=0;
//         boolean up=true;
//         while(i < m * n){
//             arr[i++]=mat[row][col];
//             // agar upar ja rha hai arrow
//             if(up){
//                 // while(row>0&& col<n-1){
//                 //     arr[i++]=mat[row][col];
//                 //     row--;
//                 //     col++;
//                 // }
//                 // kyuki hame 3 bhi to print krnna hai na
//                 // arr[i++]=mat[row][col];
//                 if(col==n-1){
//                     row++;
//                 }
//                 else{
//                     col++;
//                 }
//             }
//             else{
//                 // move down 
//                 while(col>0 && row<m-1){
//                     arr[i++]=mat[row][col];
//                     row++;
//                     col--;
//                 }
//                 arr[i++]=mat[row][col];
//                 if(row==m-1){
//                     col++;
//                 }
//                 else{
//                     row++;
//                 }
//             }
//             up = false;
//         }
//         return arr;
//     }
// }


//chatgpt solution

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 0 || mat[0].length == 0) 
            return new int[0];

        int m = mat.length;      // rows
        int n = mat[0].length;   // cols
        int[] arr = new int[m * n];
        int row = 0, col = 0, i = 0;
        boolean up = true;

        while (i < m * n) {
            arr[i++] = mat[row][col];

            if (up) {
                // moving up
                if (col == n - 1) { // reached last column
                    row++;
                    up = false;
                } else if (row == 0) { // reached first row
                    col++;
                    up = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                // moving down
                if (row == m - 1) { // reached last row
                    col++;
                    up = true;
                } else if (col == 0) { // reached first column
                    row++;
                    up = true;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return arr;
    }
}
