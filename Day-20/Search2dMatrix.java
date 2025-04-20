// Leed code Problem
// 74. Search a 2D Matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for(int r=0; r<rows; r++){
            for(int c=0; c<columns; c++){
                if(matrix[r][c]==target){
                    return true;
                }
            }
        }
        return false;
    }
}