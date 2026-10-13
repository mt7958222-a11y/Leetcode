class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        
        // Outer loop picks the starting index of the subarray
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            // Inner loop extends the subarray up to index j
            for (int j = i; j < n; j++) {
                currentSum += nums[j];
                if (currentSum == k) {
                    count++;
                }
            }
        }
        
        return count;
    }
};