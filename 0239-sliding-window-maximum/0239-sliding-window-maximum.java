class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int resIndex = 0;

        Deque<Integer> deque = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < n; i++) {
            // 1. Remove smaller elements from the back — they're useless
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // 2. Add current index
            deque.offerLast(i);

            // 3. Remove front index if it's out of this window
            if (deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // 4. Record max once the first window is complete
            if (i >= k - 1) {
                result[resIndex++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}