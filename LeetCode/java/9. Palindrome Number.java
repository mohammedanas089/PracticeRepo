class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int s = 0, e = str.length() - 1;
        boolean flag = true;
        while (s < e) {
            if (!(str.charAt(s) == str.charAt(e))) {
                flag = false;
                break;
            }
            e--;
            s++;

        }
        return flag;
    }
}