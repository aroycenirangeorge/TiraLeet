class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            int left=s.charAt(i);
            int right=s.charAt(j);
            System.out.println(left+" "+right);
            if(!Character.isLetterOrDigit(left)){
                i++;continue;
            }
            else if(!Character.isLetterOrDigit(right)){
                j--;continue;
            }
            else{
                if(Character.toLowerCase(left) != Character.toLowerCase(right)){
                    return false;
                }
            }
            i++;j--;
        }
        return true;
    }
}
