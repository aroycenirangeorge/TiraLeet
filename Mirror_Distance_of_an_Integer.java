class Solution {
    public int reverse(int n){
        int reversed=0;
        for(int i=n;i!=0;i/=10){
            reversed=(reversed*10)+(i%10);
        }
        return reversed;
    }
    public int mirrorDistance(int n) {
        int mirror= n- reverse(n);
        return mirror>0?mirror:mirror*-1;
    }
}
