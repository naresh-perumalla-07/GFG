class Solution {
    public boolean canRepresentBST(List<Integer> arr) {

        Stack<Integer> stack = new Stack<>();
        int lowerBound = Integer.MIN_VALUE;

        for (int value : arr) {

            // Once we've entered the right subtree of lowerBound,
            // no smaller value can appear.
            if (value < lowerBound) {
                return false;
            }

            // Move up the tree until we find the correct parent
            // for the current value.
            while (!stack.isEmpty() && value > stack.peek()) {
                lowerBound = stack.pop();
            }

            // Current value becomes part of the current path.
            stack.push(value);
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna