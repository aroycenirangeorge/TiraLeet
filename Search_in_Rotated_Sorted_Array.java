class Solution {
    public int findMax(int l, int r, int[] nums){
        int mid=l+(r-l)/2;
        if(r==mid){
            return mid;
        }
        if(nums[l]<nums[mid]){
            return findMax(mid,r,nums);
        }
        else{
            return findMax(l,mid,nums);
        }
    }
    public int binarySearch(int l, int r, int[] nums, int target){
        if(l>r){
            return -1;
        }
        int mid=l+(r-l)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]>target){
            return binarySearch(l,mid-1,nums,target);
        }
        else{
            return binarySearch(mid+1,r,nums,target);
        }
    }
    public int search(int[] nums, int target) {
        int result= binarySearch(0,findMax(0,nums.length-1,nums),nums,target);
        if(result==-1){
            return binarySearch(findMax(0,nums.length-1,nums)+1,nums.length-1,nums,target);
        }
        return result;
    }
}
