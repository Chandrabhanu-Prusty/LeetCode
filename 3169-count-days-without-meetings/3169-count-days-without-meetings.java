class Solution {
    public int countDays(int days, int[][] meetings) {
        //sort by start time
        //merge intervals in a res array
        // res array -> calculate gap
        //make sure calculate the start gap and end gap as well
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        int meetingDays = 0;
        List<int[]> res = new ArrayList<>();

        res.add(meetings[0]);

        for(int i=0;i<meetings.length; i++){
            if(meetings[i][0] <= res.get(res.size()-1)[1]){
                res.get(res.size()-1)[0]=Math.min(
                    res.get(res.size()-1)[0], meetings[i][0]
                );
                res.get(res.size()-1)[1]=Math.max(
                    res.get(res.size()-1)[1], meetings[i][1]
                );
            } else{
                res.add(meetings[i]);
            }
        }

        int gap=0;
        for(int i=0; i<res.size(); i++){
            meetingDays = meetingDays + res.get(i)[1] - res.get(i)[0] + 1;
        }

        return days - meetingDays;
    }
}