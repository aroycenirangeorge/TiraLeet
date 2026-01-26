class Solution {
    public String removeStars(String s) {
        Stack<Character> characters= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                characters.pop();
            }
            else{
                characters.push(s.charAt(i));
            }
        }
        String result= "";
        while(!characters.isEmpty()){
            result=characters.pop()+result;
        }
        return result;
    }
}
