class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum = 0, max =0;
        
        for (int i=0; i<k; i++){
            sum = sum + arr[i];
        }
        
        max = Math.max(max, sum);
        
        for(int i=k; i< arr.length; i++){
            sum = sum + arr[i];
            sum = sum - arr[i-k];
            
            max = Math.max(max, sum);
        }
        
        return max;
    }
}