class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        Map<Integer, List<Integer>> group = new HashMap<>();
        Map<Integer, Integer> groupId = new HashMap<>();
        Map<Integer, Integer> pos = new HashMap<>();

        int idx = 1;
        group.computeIfAbsent(idx, k -> new ArrayList<>()).add(sorted[0]);
        groupId.put(sorted[0], idx);

        for(int i = 1; i < n; i++){
            if(sorted[i] - sorted[i - 1] > limit){
                idx++;
            }

            group.computeIfAbsent(idx, k -> new ArrayList<>()).add(sorted[i]);
            groupId.put(sorted[i], idx);
        }

        for(int i = 0; i < n; i++){
            int grp = groupId.get(nums[i]);
            int p = pos.getOrDefault(grp, 0);

            nums[i] = group.get(grp).get(p);
            pos.put(grp, p + 1);
        }

        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna