class Solution {
    private int factor(int num) {
        int sum = 0, count = 0;
        for(int i = 2; i*i <= num; i++) {
            if(num % i == 0) {
                int t = num / i;
                if(t == i || count > 0) return 0;
                sum += i + t;
                count++;
            }
        }
        if(count == 0) return 0;
        return 1 + sum + num;
    }
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        for(int i = 0; i < nums.length; i++) {
            totalSum += factor(nums[i]);
        }
        return totalSum;
    }
}
