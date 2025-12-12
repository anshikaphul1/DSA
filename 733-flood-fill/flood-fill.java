class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldimage=image[sr][sc];
        if(oldimage==color) return image;
        dfs(image,sr,sc,oldimage,color);
        return image;
    }
    void dfs(int[][] image,int r,int c,int oldcolor,int newcolor){
        if(r<0 || c<0||r>=image.length || c>=image[0].length) return;
        if(image[r][c]!=oldcolor) return;
        image[r][c]=newcolor;
        dfs(image,r-1,c,oldcolor,newcolor);
        dfs(image,r+1,c,oldcolor,newcolor);
        dfs(image,r,c-1,oldcolor,newcolor);
        dfs(image,r,c+1,oldcolor,newcolor);
    }
}