class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        // Case 1: Buy type 1 and type 2 separately
        long a = (long) need1 * cost1 + (long) need2 * cost2;

        // Case 2: Buy only type 3 items
        long b = (long) costBoth * Math.max(need1, need2);

        // Case 3: Buy common items first
        int min = Math.min(need1, need2);

        long c = (long) costBoth * min
               + (long) (need1 - min) * cost1
               + (long) (need2 - min) * cost2;

        return Math.min(a, Math.min(b, c));
    }
}