class Solution {
    public boolean isTrionic(int[] nums) {
        int p = 0, q = 0;

        //This loop is for increasing part(finding p)
        for (int i = 1; i < nums.length - 2; i++) {
            if (nums[i - 1] < nums[i]) {
                p = i;
                continue;
            }
            break;
        }
        if (p == 0) return false;

        //Here decreasing part(finding q)
        for (int i = p + 1; i < nums.length - 1; i++) {
            if (nums[i - 1] > nums[i]) {
                q = i;
                continue;
            }
            break;
        }

        if (q == 0 || q == nums.length - 1) return false;

        //Again checking for increasing part 
        for (int i = q + 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}