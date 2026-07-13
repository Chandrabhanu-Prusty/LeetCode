class Solution {
    public int findDuplicate(int[] arr) {
        int slow = 0, fast = 0;

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];

            if(slow==fast){
                break;
            }
        } while(slow!=fast);
        
        int n1 =0;
        int n2 =slow;

        while(n1 != n2){
            n1 = arr[n1];
            n2 = arr[n2];
        }
        return n1;
    }
}