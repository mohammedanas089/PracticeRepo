import java.util.Map.Entry;

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Boolean> marker = new HashMap<>();
        for (int i : nums) {
            if (marker.containsKey(i)) {
                marker.put(i, true);
            } else {
                marker.put(i, false);
            }
        }
        for (Entry<Integer, Boolean> entry : marker.entrySet()) {
            if (entry.getValue() == false) {
                return entry.getKey();
            }
        }
        return -1;
    }
}