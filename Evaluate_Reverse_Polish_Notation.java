class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> notation= new Stack<>();
        for(String i : tokens){
            if(i.equals("+")||i.equals("-")||i.equals("*")||i.equals("/")){
                int b= Integer.valueOf(notation.pop());
                int a= Integer.valueOf(notation.pop());
                if(i.equals("+")){
                    notation.push(Integer.toString(a+b));
                }
                else if(i.equals("-")){
                    notation.push(Integer.toString(a-b));
                }
                else if(i.equals("*")){
                    notation.push(Integer.toString(a*b));
                }
                else if(i.equals("/")){
                    notation.push(Integer.toString(a/b));
                }
            }
            else{
                notation.push(i);
            }
        }
        return Integer.valueOf(notation.peek());
    }
}
