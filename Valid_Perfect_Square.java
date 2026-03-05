class Solution {
    public boolean isPerfectSquare(int num) {
        int l= 1, r= num;
        while (l<= r) {
            int mid = l + (r-l) / 2; 
            int res = num / mid;
            int remain = num % mid;
            if (res == mid && remain == 0){
                return true;
            }
            if (res > mid) { 
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }
}
