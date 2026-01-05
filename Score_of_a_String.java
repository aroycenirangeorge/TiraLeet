class Solution {
    public int scoreOfString(String s) {
        int score=0;
        for(int i=0;i<s.length()-1;i++){
            score+=s.charAt(i)-s.charAt(i+1)>=0?s.charAt(i)-s.charAt(i+1):-1*(s.charAt(i)-s.charAt(i+1));
        }
        return score;
    }
}
