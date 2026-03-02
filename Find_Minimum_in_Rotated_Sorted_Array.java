class Solution {
    public int binarySearch(int l, int r, int[] nums){
        if(l==r){
            return nums[l];
        }
        int mid= l+(r-l)/2;
        if(nums[mid]>nums[r]){
            return binarySearch(mid+1,r,nums);
        }
        else{
            return binarySearch(l,mid,nums);
        }
    }
    public int findMin(int[] nums) {
        return binarySearch(0,nums.length-1,nums);
    }
}
