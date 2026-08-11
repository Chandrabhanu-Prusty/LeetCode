class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int maxKey = nums[0];

        for(int i =0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            } else{
                map.put(nums[i], 1);
            }

            if (map.get(nums[i]) > maxCount) {
                maxCount = map.get(nums[i]); // Update highest count
                maxKey = nums[i];            // Save the key
            }

        }
        return maxKey;
    }
}