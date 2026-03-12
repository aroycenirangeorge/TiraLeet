class Solution {
    public boolean binarySearch(int l, int r, int[][] matrix, int target){
        if(l>r){
            return false;
        }
        int mid=l+(r-l)/2;
        int row=mid/matrix[0].length, col=mid%matrix[0].length;
        if(matrix[row][col]==target){
            return true;
        }
        else if(matrix[row][col]>target){
            return binarySearch(l,mid-1,matrix,target);
        }
        else if(matrix[row][col]<target){
            return binarySearch(mid+1,r,matrix,target);
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0, r=(matrix.length*matrix[0].length)-1;
        return binarySearch(l,r,matrix,target);
    }
}
