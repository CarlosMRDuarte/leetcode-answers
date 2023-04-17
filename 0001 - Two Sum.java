class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int n = 0; n < nums.length; n++) {
            for (int n2 = 0; n2 < nums.length; n2++) {
                if (n == n2) {
                    continue;    
                }
                
                if (nums[n] + nums[n2] == target) {
                    return new int[]{ n, n2 };
                }
            }
        }
        
        return new int[]{ }; 
    }
}
