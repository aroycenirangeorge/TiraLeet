class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy=0;
        for(int candy: candies){
            maxCandy=candy>maxCandy?candy:maxCandy;
        }
        List<Boolean> greatest= new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            greatest.add(candies[i]+extraCandies>=maxCandy);
        }
        return greatest;
    }
}
