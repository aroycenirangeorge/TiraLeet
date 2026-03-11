class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int result=0,temp=1;
        for(int i=n;i!=0;i/=2){
            if(i%2==0){
                result+=temp;
            }
            temp*=2;
        }
        return result;
    }
}
