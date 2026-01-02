class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> t= new HashSet<>();
        for(int num:nums){
            if(t.contains(num)){
                return num;
            }
            t.add(num);
        }
        return 0;
    }
}
