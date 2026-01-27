class Solution {
    public String makeGood(String s) {
        Stack<Character> letter= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!letter.isEmpty() && ((letter.peek()==s.charAt(i)+32) || (letter.peek()==s.charAt(i)-32))){
                letter.pop();
            }
            else{
                letter.push(s.charAt(i));
            }
        }
        String result="";
        while(!letter.isEmpty()){
            result=letter.pop()+result;
        }
        return result;
    }
}
