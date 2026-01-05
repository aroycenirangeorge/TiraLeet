class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefix= new int[n];
        int[] suffix= new int[n];
        prefix[0]=1; suffix[0]=1;
        for(int i=0;i<n-1;i++){
            prefix[i+1]=nums[i]*prefix[i];
            suffix[i+1]=nums[n-i-1]*suffix[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=prefix[i]*suffix[n-i-1];
        }
        return nums;
    }
}  
