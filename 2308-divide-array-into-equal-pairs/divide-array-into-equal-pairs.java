class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (counter.containsKey(num)) {
                counter.put(num, counter.get(num) + 1);
            } else {
                counter.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            int count = entry.getValue();
            if (count % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}