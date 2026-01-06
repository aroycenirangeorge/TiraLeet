class Solution {
    public String mergeAlternately(String word1, String word2) {
        String t="";
        int length1=word1.length(), length2=word2.length();
        int length= length1>=length2?length1:length2;
        for(int i=0;i<length;i++){
            if(i<length1){
                t+=word1.charAt(i);
            }
            if(i<length2){
                t+=word2.charAt(i);
            }
        }
        return t;
    }
}
