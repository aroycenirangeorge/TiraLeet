class Solution {
    public String replaceDigits(String s) {
        String t="";
        for (int i = 0; i < s.length(); i++) {
        if (i % 2 == 0) {
            t+=s.charAt(i);
        } else {
            char prev = s.charAt(i - 1);
            int shift = s.charAt(i) - '0';
            t+=(char)(prev + shift);
        }
        }
        return t;
    }
}
