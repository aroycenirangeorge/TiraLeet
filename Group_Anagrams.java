class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> countAndWord = new HashMap<>();
        for (String word : strs) {
            int[] count = new int[26];
            for (int i=0;i<word.length();i++) {
                count[word.charAt(i)-'a']++;
            }
            String key="";
            for (int num: count) {
                key+=num+'#';
            }
            if (!countAndWord.containsKey(key)) {
                countAndWord.put(key, new ArrayList<>());
            }
            countAndWord.get(key).add(word);
        }
        return new ArrayList<>(countAndWord.values());        
    }
}
