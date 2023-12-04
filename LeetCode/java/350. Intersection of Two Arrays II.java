import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map1.containsKey(nums1[i])) {
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
                continue;
            }
            map1.put(nums1[i], 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map2.containsKey(nums2[i])) {
                map2.put(nums2[i], map2.get(nums2[i]) + 1);
                continue;
            }
            map2.put(nums2[i], 1);
        }

        String str = "";
        int minval;
        for (int i : map1.keySet()) {

            if (map2.containsKey(i)) {
                minval = Math.min(map1.get(i), map2.get(i));
                for (int k = 0; k < minval; k++) {
                    str = str + i + " ";

                }
            }
        }
        if (str.isEmpty()) {
            int[] arr = {};
            return arr;
        }
        String[] store = str.split(" ");
        for (int i = 0; i < store.length; i++) {
        }
        int[] arr = new int[store.length];
        for (int i = 0; i < store.length; i++) {
            arr[i] = Integer.parseInt(store[i]);
        }

        return arr;
    }
}