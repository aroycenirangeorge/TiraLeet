class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> letters= new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            letters.add(sentence.charAt(i));
        }
        return letters.size()==26;
    }
}
