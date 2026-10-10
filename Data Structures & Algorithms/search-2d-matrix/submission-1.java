class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = n*m-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            int value = matrix[mid/m][mid%m];
            if(value == target){
                return true;
            }
            if(value > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return false;
    }
}
