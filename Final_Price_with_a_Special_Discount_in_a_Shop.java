class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = prices.clone();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int t = stack.pop();
                answer[t] = prices[t] - prices[i];
            }
            stack.push(i);
        }
        return answer;
    }
}
