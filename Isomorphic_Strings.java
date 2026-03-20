class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Character> letter= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!letter.containsKey(s.charAt(i))){
                if(letter.containsValue(t.charAt(i))) return false;
                letter.put(s.charAt(i),t.charAt(i));
            }
            else{
                if(letter.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
