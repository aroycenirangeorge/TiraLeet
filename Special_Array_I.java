class Solution {
    public boolean isArraySpecial(int[] nums) {
        int i=0;
        if(nums.length==1)
            return true;
        while(i<nums.length-1){
            if(nums[i]%2==nums[i+1]%2)
                return false;
            i++;
        }
        return true;
}
}
