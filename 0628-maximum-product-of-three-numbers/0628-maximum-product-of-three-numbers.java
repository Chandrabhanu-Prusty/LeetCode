class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int res = 1;
        int n = nums.length - 1;
        int max1 = nums[n] * nums[n-1] * nums[n-2];
        int max2 = nums[0] * nums[1] * nums[n];
        res = Math.max(max1, max2);
        return res;
    }
}
