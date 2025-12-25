class Solution {
    public void sortColors(int[] nums) {
        int left= 0;
        int mid= 0;
        int right= nums.length-1;
        while(mid<=right){
            if(nums[mid]==0){
                int t=nums[left];
                nums[left]=nums[mid];
                nums[mid]=t;
                left+=1;
                mid+=1;
            }
            else if(nums[mid]==2){
                int t=nums[right];
                nums[right]=nums[mid];
                nums[mid]=t;
                right-=1;
            }
            else{
                mid+=1;
            }
        }
    }
}
