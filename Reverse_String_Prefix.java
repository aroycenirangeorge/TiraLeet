class Solution {
    public String reversePrefix(String s, int k) {
        char[] array= new char[s.length()];
        for(int i=0;i<s.length();i++){
            array[i]=s.charAt(i);
        }
        int i=0;
        int j=k-1;
        while(i<j){
            char t= array[i];
            array[i]=array[j];
            array[j]=t;
            i++; j--;
        }
        String t="";
        for(char x:array){
            t+=x;
        }
        return t;
    }
}
