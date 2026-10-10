class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> t = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int x= Math.abs(nums[i]);
            if(nums[x-1]<0){
                t.add(x);
            } else{
                nums[x-1]*=-1;
            }
        }
        return t;
    }
}
