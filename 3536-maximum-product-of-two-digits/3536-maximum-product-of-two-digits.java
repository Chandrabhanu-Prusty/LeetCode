class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        int d = 0;
        int count = -1;
        while(n!=0){
            d = n % 10;
            list.add(d);
            n = n/10;
            count++;
        }
        Collections.sort(list);
        int num1 = list.get(count);
        int num2 = list.get(count-1);
        int res = num1 * num2;
        return res;
    }
}