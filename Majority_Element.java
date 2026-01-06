class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> numberAndCount= new HashMap<>();
        int n=nums.length/2;
        for(int num:nums){
            if(!numberAndCount.containsKey(num)){
                numberAndCount.put(num,0);
            }
            numberAndCount.put(num,numberAndCount.get(num)+1);
            if(numberAndCount.get(num)>n){
                return num;
            }
        }
        return 0;
    }
}
