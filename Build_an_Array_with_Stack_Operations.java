class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations= new ArrayList<>();
        int length= target.length;
        int count=0; int j=0;
        for(int i=1;i<=n;i++){
            operations.add("Push");
            count++;
            if(target[j]!=i){
                operations.add("Pop");
                count--;
            }
            else{
                j++;
            }
            if(count==length){
                return operations;
            }
        }
        return operations;
    }
}
