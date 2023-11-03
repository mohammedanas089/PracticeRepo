class Solution {
    public int firstUniqChar(String s) {
        int count;
        for (int i = 0; i < s.length(); i++) {
            count = 0;
            for (int j = 0; j < s.length() && count < 2; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count < 2) {
                return i;
            }
        }
        return -1;
    }
}