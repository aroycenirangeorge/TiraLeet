class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet= new HashSet<>();
        for(int i:nums){
            numSet.add(i);
        }
        int max=0;
        for(int i:numSet){
            if(numSet.contains(i-1)){
                continue;
            }
            int length= 0;
            for(int j=i; numSet.contains(j);j++){
                length++;
            }
            max=Math.max(length,max);
        }
        return max;
    }
}
