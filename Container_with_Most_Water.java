class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1,maxVolume=0;
        while(i<j){
            int minimum= heights[i]<heights[j] ? heights[i] : heights[j];
            int volume= minimum*(j-i);
            maxVolume= volume>maxVolume? volume : maxVolume;
            if(minimum==heights[i]){
                i++;
            }else{j--;}
        }
        return maxVolume;
    }
}
