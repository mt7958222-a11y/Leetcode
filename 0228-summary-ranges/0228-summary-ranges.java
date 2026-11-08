class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> ans = new ArrayList<>();

        int n = nums.length;
        int i = 0;

        while (i < n) {

            int start = nums[i];

            // Find the end of the consecutive sequence
            while (i < n - 1 && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            int end = nums[i];

            // Create the range string
            if (start == end) {
                ans.add(String.valueOf(start));
            } else {
                ans.add(start + "->" + end);
            }

            i++;
        }

        return ans;
    }
}