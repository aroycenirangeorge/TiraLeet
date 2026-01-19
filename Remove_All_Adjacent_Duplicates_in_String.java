class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack= new Stack<>();
        String unique="";
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && s.charAt(i)==stack.peek()){
                stack.pop(); continue;
            }
            stack.push(s.charAt(i));
        }
        for(char c: stack){
            unique+=c;
        }
        return unique;
    }
}
