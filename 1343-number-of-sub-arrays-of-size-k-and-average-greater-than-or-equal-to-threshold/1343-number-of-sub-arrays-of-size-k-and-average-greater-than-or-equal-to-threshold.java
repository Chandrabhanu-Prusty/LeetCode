class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        int maxT = k * threshold;
        for(int i =0; i<k; i++){
            sum = sum + arr[i];
        }
        if(sum>=maxT){
            count++;
        }

        for(int i=k; i<arr.length; i++){
            sum += arr[i];
            sum -= arr[i-k];

            if(sum >= maxT){
                count++;
            } 
        }
        return count;
    }
}