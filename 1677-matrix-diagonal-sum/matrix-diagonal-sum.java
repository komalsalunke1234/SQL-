class Solution {
    public int diagonalSum(int[][] mat) {
       int total=0;
        for(int i=0;i<mat.length;i++){
           
                // if(mat.length==1){
                //     return mat[i];
                // }
                total+=mat[i][i];
                if(i!=mat.length-i-1){
            total+=mat[i][mat.length-i-1];
                }
            
        }
        return total;
    }
}