class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        // 0 1 2 3 4
        // 1 2 3 4 5
        //          
        // k =2
        //low = 0, high = 4
        //mid = 4+2/2= 3
        //
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        
        while(low<=high){
            int mid = low + (high-low) / 2;
            
            if(arr[mid] == k){
                ans = mid;
                high = mid-1;
            }
            
            else if(arr[mid]<k){
                low = mid + 1;
            }
            
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
}