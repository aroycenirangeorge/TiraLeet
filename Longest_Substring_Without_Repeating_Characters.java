class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> temp= new HashSet<>();
        int i=0,j=0;
        int longest=0;
        while(i<s.length() && j<s.length()){
            if(!temp.contains(s.charAt(j))){
                temp.add(s.charAt(j));
                j++;
            }
            else{
                while(temp.contains(s.charAt(j))){
                    temp.remove(s.charAt(i));
                    i++;
                }
            }
            longest= longest>j-i ? longest : j-i;
        }
        return longest;
    }
}
