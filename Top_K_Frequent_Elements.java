class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> elementAndCount = new HashMap<>();
        for(int i:nums){
            if(!elementAndCount.containsKey(i)){
                elementAndCount.put(i,0);
            }
            elementAndCount.put(i,elementAndCount.get(i)+1);
        }

        Map<Integer,List<Integer>> countAndElement = new HashMap<>();
        for(int i:elementAndCount.keySet()){
            int count= elementAndCount.get(i);
            if(!countAndElement.containsKey(count)){
                countAndElement.put(count,new ArrayList<Integer>());
            }
            countAndElement.get(count).add(i);
        }

        int nos=0;
        int[] result = new int[k];
        for(int count=nums.length;count>=1;count--){
            if(countAndElement.containsKey(count)){
                for(int i:countAndElement.get(count)){
                    if(nos<k){
                        result[nos]=i;
                        nos++;
                    }
                    else{
                        break;
                    }
                }
            }
        }

    return result;

    }
}
