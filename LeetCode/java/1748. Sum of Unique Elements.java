class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, 0);
            } else {
                map.put(i, 1);
            }
        }
        int sum = 0;
        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                sum += i;
            }
        }
        return sum;
    }
}