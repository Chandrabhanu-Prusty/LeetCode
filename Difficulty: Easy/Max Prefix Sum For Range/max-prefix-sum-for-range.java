class Solution {
    public ArrayList<Integer> maxPrefixSumQueries(int[] arr, int[][] queries) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            int sum = 0;
            int maxSum = Integer.MIN_VALUE;

            for (int j = l; j <= r; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
            res.add(maxSum);
        }
        return res;
    }
}