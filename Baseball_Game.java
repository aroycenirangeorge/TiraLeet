class Solution {
    public int calPoints(String[] operations) {
        int totalSum=0;
        Stack<Integer> score= new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int x=score.pop();
                int sum=x+score.peek();
                score.push(x);
                score.push(sum);
                totalSum+=score.peek();
            }
            else if(operations[i].equals("D")){
                score.push(score.peek()*2);
                totalSum+=score.peek();
            }
            else if(operations[i].equals("C")){
                totalSum-=score.pop();
            }
            else{
                score.push(Integer.valueOf(operations[i]));
                totalSum+=score.peek();
            }
        }
        return totalSum;
    }
}
