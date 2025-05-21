class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        boolean firstrowzero=false;
        boolean firstcolzero=false;

        //first row
        for(int j=0;j<cols;j++){
            if(matrix[0][j]==0){
                firstrowzero=true;
                break;
            }
        }
        //first col
        for(int i=0;i<rows;i++){
            if(matrix[i][0]==0){
                firstcolzero=true;
                break;
            }
        }
        //use first row and col marker
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;

                }
            }
        }
        //set matrix elemnet to 0 based on marker
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        //zero out first row if needed
        if(firstrowzero){
            for(int j=0;j<cols;j++){
                matrix[0][j]=0;
            }
        }
        //zero out first col if needed
        if(firstcolzero){
            for(int i=0;i<rows;i++){
                matrix[i][0]=0;
            }
    }

    }
}