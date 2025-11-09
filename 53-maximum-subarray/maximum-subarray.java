class Solution {
    public int maxSubArray(int[] nums) {
         int maxSoFar = Integer.MIN_VALUE; 
                int currentMax = 0; 
                for (int num : nums) {
            currentMax += num; 
                        maxSoFar = Math.max(maxSoFar, currentMax); 
            if (currentMax < 0) {
                currentMax = 0;
            }
        }
                return maxSoFar; 
    }
}