class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        list.add(min);
        list.add(max);
        return list;
    }
}
