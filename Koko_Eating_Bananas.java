class Solution {
    public long function(int[] piles, int mid){
        long sum=0;
        for(int i:piles){
            sum+=(i+mid-1)/mid;
        }
        return sum;
    }
    public int binarySearch(int l, int r, int[] piles, int result,int h){
        if(l>r){
            return result;
        }
        int mid= l+(r-l)/2;
        long sum= function(piles,mid);
        result= sum<=h?mid:result;
        if(sum<=h){
            return binarySearch(l, mid-1, piles, result, h);
        }
        else{
            return binarySearch(mid+1, r, piles, result, h);
        }
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i: piles){
            max=max>i?max:i;
        }
        int l=1,r=max;
        int result= r;
        return binarySearch(l, r, piles, result, h);
    }
}
