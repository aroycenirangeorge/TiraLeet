class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> t= new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(t.contains(s.charAt(i))){
                return s.charAt(i);
            }
            t.add(s.charAt(i));
        }
        return ' ';
    }
}
