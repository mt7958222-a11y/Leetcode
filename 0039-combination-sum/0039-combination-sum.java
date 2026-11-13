class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    private void backtrack(int[] candidates, int target, int index,
                           List<Integer> current,
                           List<List<Integer>> ans) {

        // Base case: target becomes 0
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Try all candidates starting from index
        for (int i = index; i < candidates.length; i++) {

            // If current number is greater than target
            if (candidates[i] > target) {
                continue;
            }

            // Choose the current number
            current.add(candidates[i]);

            // Recursion: same index because reuse is allowed
            backtrack(candidates, target - candidates[i],
                      i, current, ans);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}