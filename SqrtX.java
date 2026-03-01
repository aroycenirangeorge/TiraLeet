class Solution {
    public int binarySearch(int l, int r, int target){
        int m= l+(r-l)/2;
        if(l>r){
            return r;
        }
        if(m==target/m){
            return m;
        }
        else if(m>target/m){
            return binarySearch(l,m-1,target);
        }
        else{
            return binarySearch(m+1,r,target);
        }
    }
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        return binarySearch(1,x,x);
    }
}
