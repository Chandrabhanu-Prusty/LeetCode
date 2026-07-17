class Solution {
    public int calNextIdx(int[] nums, int curr){
        int next = curr;

        int seq = nums[curr];

        if(seq > 0){
            next = (next + seq) % nums.length;
        } else{
            //mod with -ve
            int mod = seq % nums.length;
            int forward = nums.length + mod;
            next = (curr + forward) % nums.length;
        }
        return next;
    }
    public boolean circularArrayLoop(int[] nums) {
        //sequnce, k>1, all positives or all negatives
        //check for all indexes
        for(int i=0; i<nums.length; i++){
            //set -> indexes that we have visited so far
            //flag -> isPositive = nums[i] > 0
            
            Set<Integer> set = new HashSet<>();
            set.add(i);

            boolean isPos = nums[i] > 0;

            int curr = i;

            //cycle detection
            while(true){
                int next = calNextIdx(nums, curr);

                if(isPos){
                    if(nums[next] < 0){
                        break;
                    } else{
                        if(set.contains(next)){
                            //cycle there 
                            //check for k>1
                            if(curr != next){
                                return true;
                            } else{
                                break;
                            }
                        }
                        set.add(next);
                    } 
                } else{
                    if(nums[next] > 0){
                        break;
                    } else{
                        if(set.contains(next)){
                            //cycle there 
                            //check for k>1
                            if(curr != next){
                                return true;
                            } else{
                                break;
                            }
                        }
                        set.add(next);
                    }
                }
                curr = next;
            }
        }
        return false;
    }
}