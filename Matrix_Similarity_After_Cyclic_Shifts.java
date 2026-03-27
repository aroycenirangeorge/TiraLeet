class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        for(int[] row: mat){
            int n=row.length;
            for(int i=0;i<n;i++){
                if(row[i]!=row[(i+k)%n]){
                    return false;
                }
            }
        }
        return true;
    }
}
