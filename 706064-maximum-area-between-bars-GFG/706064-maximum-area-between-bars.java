class Solution {
    public int maxArea(List<Integer> height) {
        int left = 0;
        int right = height.size() - 1;
        
        long maxArea = 0;
        
        while (left < right) {
            long width = right - left - 1;
            long area = (long) Math.min(height.get(left), height.get(right)) * width;
            
            maxArea = Math.max(maxArea, area);
            
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        
        return (int) maxArea;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna