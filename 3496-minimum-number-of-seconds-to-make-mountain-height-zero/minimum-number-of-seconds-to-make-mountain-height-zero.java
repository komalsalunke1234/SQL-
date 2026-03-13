class Solution {

    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        long left = 1;
        long right = (long) 1e18;
        long ans = right;

        while (left <= right) {

            long mid = left + (right - left) / 2;

            if (check(mid, mountainHeight, workerTimes)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    private boolean check(long mid, int mountainHeight, int[] workerTimes) {

        long height = 0;

        for (int t : workerTimes) {

            long k = (long)(Math.sqrt(((2.0 * mid) / t) + 0.25) - 0.5);

            height += k;

            if (height >= mountainHeight) {
                return true;
            }
        }

        return false;
    }
}