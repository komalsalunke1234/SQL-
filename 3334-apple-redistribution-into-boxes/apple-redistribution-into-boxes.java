import java.util.Arrays;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        // 1. Calculate total apples
        int totalApples = 0;
        for (int a : apple) {
            totalApples += a;
        }

        // 2. Sort capacity in ascending order
        Arrays.sort(capacity);

        // 3. Use boxes from largest capacity to smallest
        int boxes = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            totalApples -= capacity[i];
            boxes++;

            // 4. If all apples are placed
            if (totalApples <= 0) {
                return boxes;
            }
        }

        return boxes; // guaranteed solution exists
    }
}
