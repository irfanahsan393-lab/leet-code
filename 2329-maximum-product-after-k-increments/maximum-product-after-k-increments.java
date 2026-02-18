import java.util.*;

class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Add all elements to min heap
        for (int num : nums) {
            pq.offer(num);
        }
        
        // Perform k increments
        while (k-- > 0) {
            int smallest = pq.poll();
            pq.offer(smallest + 1);
        }
        
        long mod = 1000000007;
        long product = 1;
        
        // Calculate product
        while (!pq.isEmpty()) {
            product = (product * pq.poll()) % mod;
        }
        
        return (int) product;
    }
}