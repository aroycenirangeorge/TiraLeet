class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        int i=0;
        for(i=0;i<s.length();i++){
            sum+=s.charAt(i);
            sum-=t.charAt(i);
        }
        sum-=t.charAt(i);
        return (char) -sum;
    }
}
