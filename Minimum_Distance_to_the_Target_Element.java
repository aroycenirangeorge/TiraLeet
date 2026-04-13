class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min= Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int t= start-i>0? start-i: i-start;
                min=t<min ?t :min;
            }
        }
        return min;
    }
}
