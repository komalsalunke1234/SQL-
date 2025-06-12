class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            int next = nums[(i + 1) % n]; 
            max = Math.max(max, Math.abs(next - nums[i]));
        }
        return max;
    }
}
