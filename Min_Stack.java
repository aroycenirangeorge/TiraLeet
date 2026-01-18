class MinStack {
    public Stack<Integer> stack;
    public MinStack() {
        stack= new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        if(!stack.isEmpty())
            stack.pop();
    }
    
    public int top() {
        if(!stack.isEmpty())
            return stack.peek();
        return 0;
    }
    
    public int getMin() {
        int min= Integer.MAX_VALUE;
        for(int element: stack){
            if(element<min){
                min=element;
            }
        }
        return min;
    }
}
