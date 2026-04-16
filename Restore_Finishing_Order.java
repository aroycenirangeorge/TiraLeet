class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> friend= new HashSet<>();
        for(int i=0;i<friends.length;i++){
            friend.add(friends[i]);
        }
        for(int i=0,k=0;i<order.length;i++){
            if(friend.contains(order[i])){
                friends[k++]=order[i];
            }
        }
        return friends;
    }
}
