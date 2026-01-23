class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for (int num:nums)
            c+= num%3!=0 ? 1 : 0;
        return c;
    }
}
