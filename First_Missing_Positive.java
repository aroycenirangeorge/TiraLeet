class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> t= new HashSet<>();
        for(int i=0; i<nums.length; i++){
            t.add(nums[i]);
        }
        for(int i=1; i<nums.length+1;i++){
            if(!t.contains(i)){
                return i;
            }
        }
        return nums.length+1;
    }
}
