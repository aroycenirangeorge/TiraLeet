class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> charAndCount= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!charAndCount.containsKey(s.charAt(i))){
                charAndCount.put(s.charAt(i),0);
            }
            charAndCount.put(s.charAt(i),charAndCount.get(s.charAt(i))+1);
        }
        for(int i=0;i<t.length();i++){
            if((!charAndCount.containsKey(t.charAt(i))) || (charAndCount.get(t.charAt(i))==0)){
                return false;
            }
            charAndCount.put(t.charAt(i),charAndCount.get(t.charAt(i))-1);
        }
        return true;
    }
}
