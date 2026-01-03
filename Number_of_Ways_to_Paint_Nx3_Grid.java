class Solution {
    public int numOfWays(int n) {
        long mod= 1_000_000_007;
        long aba=6;
        long abc=6;
        for(int i=1;i<n;i++){
            long nextaba=((3*aba)+(2*abc))%mod;
            long nextabc=((2*aba)+(2*abc))%mod;
            abc=nextabc;
            aba=nextaba;
        }
        return (int)((aba+abc)%mod);
    }
}
