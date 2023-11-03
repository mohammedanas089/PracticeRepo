class Solution {
    public int strStr(String haystack, String needle) {
        String temp;
        int isize = (haystack.length() - needle.length());
        int jsize;
        for (int i = 0; i <= isize; i++) {
            temp = "";
            jsize = (i + needle.length());
            for (int j = i; j < jsize; j++) {
                temp += haystack.charAt(j);
            }
            if (temp.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}