class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
        int firstMax= Integer.MIN_VALUE;
        int nextMax= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>firstMax){
                nextMax=firstMax;
                firstMax=nums[i];
            } else if(nums[i]>nextMax){
                nextMax=nums[i];
            }
        }
        return (firstMax-1)*(nextMax-1);
    }
}
