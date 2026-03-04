class Solution {
    public String reverseWords(String s) {
        String word="";
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                while(!stack.isEmpty()){
                    word+=stack.pop();
                }
                word+=' ';
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()){
                word+=stack.pop();
        }
        return word;
    }
}
