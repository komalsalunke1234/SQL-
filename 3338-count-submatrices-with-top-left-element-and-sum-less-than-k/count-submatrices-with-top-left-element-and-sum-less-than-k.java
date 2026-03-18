class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int[]colsum=new int[n];
        int count=0;
        for(int i=0;i<m;i++){
            int rowprefix=0;
            for(int j=0;j<n;j++)
            {
                colsum[j]+=grid[i][j];
                rowprefix+=colsum[j];
                if(rowprefix<=k){
                    count++;
                }
            }
        }
        return count;
    }
}