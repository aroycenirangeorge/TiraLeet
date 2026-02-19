class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> first= new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            first.add(nums1[i]);
        }
        Set<Integer> second= new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(first.contains(nums2[i])){
                second.add(nums2[i]);
            }
        }
        int[] intersect= new int[second.size()];
        int i=0;
        for(int num: second){
            intersect[i++]=num;
        }
        return intersect;
    }
}
