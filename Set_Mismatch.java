class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum=0,totalSum=0;
        Set<Integer> numbers= new HashSet<>();
        int[] result= new int[2];
        for(int i=0;i<nums.length;i++){
            if(!numbers.contains(nums[i])){
                numbers.add(nums[i]);
                sum+=nums[i];
            }
            else{
                result[0]=nums[i];
            }
            totalSum+=i+1;
        }
        result[1]=totalSum-sum;
        return result;
    }
}
