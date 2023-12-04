class Solution {
    public int titleToNumber(String columnTitle) {
        int size=columnTitle.length()-1;
        int start=0;
        String alpha="_ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        double o=0;
        while(size>-1){
                o=o+Math.pow(26,size)*alpha.indexOf(columnTitle.charAt(start));
                start++;
                size--;
        }
        return (int)o;
    }
}