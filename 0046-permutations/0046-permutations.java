class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, new ArrayList<>(), result);

        return result;
    }

    public void backtrack(int[] nums, List<Integer> current,
                           List<List<Integer>> result) {

        // All elements are used
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int num : nums) {

            // Don't use the same element again
            if (current.contains(num)) {
                continue;
            }

            // Choose
            current.add(num);

            // Explore
            backtrack(nums, current, result);

            // Undo
            current.remove(current.size() - 1);
        }
    }
}