  
class Solution {
    public long distributeCandies(int n, int limit) {
        long count = 0;

        // i: candies to first child
        for (int i = 0; i <= Math.min(n, limit); i++) {
            int remaining = n - i;

            // j must satisfy:
            int lower = Math.max(0, remaining - limit);
            int upper = Math.min(limit, remaining);

            if (lower <= upper) {
                count += (upper - lower + 1);
            }
        }

        return count;
    }
}
