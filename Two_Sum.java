class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numberAndIndex= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff= target-nums[i];
            if(numberAndIndex.containsKey(diff)){
                return new int[]{numberAndIndex.get(diff),i};
            }
            numberAndIndex.put(nums[i],i);
        }
        return new int[]{};
    }
}
