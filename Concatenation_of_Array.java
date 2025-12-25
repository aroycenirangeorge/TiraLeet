class Solution {
    public int[] getConcatenation(int[] nums) {
        int k = nums.length;
        int[] t = new int[2*k];
        for(int i=0;i<k;i++){
            t[i] = nums[i];
            t[i+k] = nums[i];
        }
        return t;
    }
}
