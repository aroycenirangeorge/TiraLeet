class Solution {
    public int sumList(int n){
        int sum=0;
        for(int i=n;i!=0;i/=10){
            sum+=i%10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int minIndex= Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sumList(nums[i])==i && i<minIndex){
                minIndex=i;
            }
        }
        return minIndex<Integer.MAX_VALUE ? minIndex : -1;
    }
}
