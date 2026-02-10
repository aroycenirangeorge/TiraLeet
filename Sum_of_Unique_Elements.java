class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> frequency= new HashMap<>();
        int sum=0;
        for(int i: nums){
            if(!frequency.containsKey(i)){
                frequency.put(i,0);
            }
            frequency.put(i,frequency.get(i)+1);
        }
        for(int i: frequency.keySet()){
            if(frequency.get(i)==1){
                sum+=i;
            }
        }
        return sum;
    }
}
