class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> numberAndCount= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!numberAndCount.containsKey(arr[i])){
                numberAndCount.put(arr[i],0);
            }
            numberAndCount.put(arr[i],numberAndCount.get(arr[i])+1);
        }
        int max=-1;
        for(int i: numberAndCount.keySet()){
            if(i==numberAndCount.get(i) && max<i){
                max=i;
            }
        }
        return max;
    }
}
