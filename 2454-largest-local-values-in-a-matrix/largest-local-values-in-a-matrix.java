class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n-2][n-2];

        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                ans[i][j]=solve(grid,i,j);
            }
        }

        return ans;
    }

    public int solve(int[][] mat,int i,int j){
        int max = Integer.MIN_VALUE;
        for(int k=i;k<i+3;k++){
            for(int l=j;l<j+3;l++){
                max = Math.max(max,mat[k][l]);
            }
        }
        return max;
    }
}