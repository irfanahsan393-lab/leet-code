import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
        // Sort in ascending order
        Arrays.sort(cost);
        
        int total = 0;
        int n = cost.length;
        
        // Traverse from highest price to lowest
        for (int i = n - 1; i >= 0; i -= 3) {
            total += cost[i];           // Most expensive
            if (i - 1 >= 0)
                total += cost[i - 1];   // Second most expensive
            // i - 2 is free (skip)
        }
        
        return total;
    }
}