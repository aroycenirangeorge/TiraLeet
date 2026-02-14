class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n= grid.length;
        Map<Integer,Integer> numberAndFrequency= new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!numberAndFrequency.containsKey(grid[i][j])){
                    numberAndFrequency.put(grid[i][j],0);
                }
                numberAndFrequency.put(grid[i][j],numberAndFrequency.get(grid[i][j])+1);
            }
        }
        int[] result= new int[2];
        for(int i=1;i<=n*n;i++){
            if(numberAndFrequency.keySet().contains(i)){
                if(numberAndFrequency.get(i)==2){
                    result[0]=i;
                }
            }
            else{
                result[1]=i;
            }
        }
        return result;
    }
}
