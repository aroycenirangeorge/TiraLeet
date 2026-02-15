class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        String sum="";
        while(i!=-1 || j!=-1 || carry==1){
            int bitSum=0;
            if(i!=-1){
                bitSum+=a.charAt(i--)-'0';
            }
            if(j!=-1){
                bitSum+=b.charAt(j--)-'0';
            }
            if(carry==1){
                bitSum++;
                carry=0;
            }
            sum=String.valueOf(bitSum%2)+sum;
            carry=bitSum/2;
        }
        return sum;
    }
}
