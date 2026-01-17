class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(!stack.isEmpty() && c=='}' && stack.peek()=='{'){
                stack.pop();
            }
            else if(!stack.isEmpty() && c==']' && stack.peek()=='['){
                stack.pop();
            }
            else if(!stack.isEmpty() && c==')' && stack.peek()=='('){
                stack.pop();
            }
            else if(stack.isEmpty() &&(c=='}' || c=='}' || c=='}')){
                return false;
            }
            else{
                stack.push(c);
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
