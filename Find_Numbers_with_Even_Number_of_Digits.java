class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int num:nums){
            int count=0;
            for(int j=num;j>0;j/=10){
                count++;
            }
            even+=count%2==0?1:0;
        }
        return even;
    }
}
