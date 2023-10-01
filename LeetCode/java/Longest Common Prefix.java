class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len=999;
        for(String i:strs){
            len=Math.min(i.length(),len);
        }
        String s="";
        int j;
        for(int i=0;i<len;i++){
            char c=strs[0].charAt(i);
            for(j=1;j<strs.length;j++){
                if(!(strs[j].charAt(i)==c)){
                    break;
                }
            }
            if(j!=strs.length){
                break;
            }
            else{
                s+=c;
            }
        }
        return s;
    }
}