class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> x= new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                x.add("FizzBuzz");
            }
            else if(i%3==0){
                x.add("Fizz");
            }
            else if(i%5==0){
                x.add("Buzz");
            }
            else{
                x.add(Integer.toString(i));
            }
        }
        return x;
    }
}
