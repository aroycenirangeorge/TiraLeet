class MyQueue {

    Stack<Integer> stack, helper;

    public MyQueue() {
        stack= new Stack<>();
        helper= new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        if(helper.isEmpty()){
            while(!stack.isEmpty()){
                helper.push(stack.pop());
            }
        }
        return helper.pop();
    }
    
    public int peek() {
        if(helper.isEmpty()){
            while(!stack.isEmpty()){
                helper.push(stack.pop());
            }
        }
        return helper.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty() && helper.isEmpty();
    }
}
