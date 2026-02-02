import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int current : asteroids) {
            boolean alive = true;

            while (alive && current < 0 && !stack.isEmpty() && stack.peek() > 0) {
                int top = stack.peek();

                if (top < Math.abs(current)) {
                    stack.pop(); // top destroyed
                } else if (top == Math.abs(current)) {
                    stack.pop(); // both destroyed
                    alive = false;
                } else {
                    // current destroyed
                    alive = false;
                }
            }

            if (alive) {
                stack.push(current);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.get(i);
        }

        return result;
    }
}
