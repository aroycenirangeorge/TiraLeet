class Solution {
    public int[] transformArray(int[] nums) {
        int[] parity= new int[nums.length];
        int i=0,j=nums.length-1;
        for(int k=0;k<nums.length;k++){
            if(nums[k]%2==0){
                parity[i++]=0;
            }
            else{
                parity[j--]=1;
            }
            
        }
        return parity;
    }
}
