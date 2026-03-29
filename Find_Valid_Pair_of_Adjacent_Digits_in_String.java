class Solution {
    public String findValidPair(String s) {
        Map<Character,Integer> frequency= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char letter= s.charAt(i);
            if(!frequency.containsKey(letter)){
                frequency.put(letter,0);
            }
            frequency.put(letter,frequency.get(letter)+1);
        }
        for(int j=0;j<s.length()-1;j++){
            char a= s.charAt(j);
            char b= s.charAt(j+1);
            if(a!=b && a-'0'==frequency.get(a) && b-'0'==frequency.get(b)){
                return ""+a+b;
            }
        }
        return "";
    }
}
