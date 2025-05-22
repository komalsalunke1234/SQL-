class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 2]; // For range updates

        // Step 1: Mark all queries in the difference array
        for (int[] q : queries) {
            int left = q[0];
            int right = q[1];
            diff[left] += 1;
            diff[right + 1] -= 1;
        }

        // Step 2: Calculate coverage array from diff
        int[] cover = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += diff[i];
            cover[i] = sum;
        }

        // Step 3: Check if every element in nums can be reduced to 0
        for (int i = 0; i < n; i++) {
            if (cover[i] < nums[i]) {
                return false; // Not enough coverage for this index
            }
        }

        return true;
    }
}
