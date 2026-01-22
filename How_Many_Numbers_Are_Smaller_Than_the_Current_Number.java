class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] t= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            t[i]=nums[i];
        }
        Arrays.sort(nums);
        Map<Integer,Integer> numberAndIndex= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!numberAndIndex.containsKey(nums[i])){
                numberAndIndex.put(nums[i],i);
            }
        }
        for(int i=0;i<t.length;i++){
            t[i]=numberAndIndex.get(t[i]);
        }
        return t;
    }
}
