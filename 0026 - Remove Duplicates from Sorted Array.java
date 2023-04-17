class Solution {
    public int removeDuplicates(int[] nums) {
        var unique = IntStream.of(nums).distinct().toArray();
        for (int i = 0; i < unique.length; i++) {
            nums[i] = unique[i];
        }
        return unique.length;
    }
}
