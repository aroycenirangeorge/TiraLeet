class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> elementAndCount= new HashMap<>();
        List<Integer> result= new ArrayList<>();
        int threshold= nums.length/3;
        for(int i=0; i<nums.length; i++){
            if(!elementAndCount.containsKey(nums[i])){
                elementAndCount.put(nums[i],0);
            }
            elementAndCount.put(nums[i],elementAndCount.get(nums[i])+1);
            if(elementAndCount.get(nums[i])>threshold && !result.contains(nums[i])){
                result.add(nums[i]);
            }
        }
        return result;
    }
}
