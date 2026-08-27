class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int currentend = 0;
        int forward = 0;
        for(int i = 0;i < nums.length-1;i++){
            forward = Math.max(forward,i+nums[i]);

            if(i == currentend){
                jump++;
                currentend = forward;
            }
        }
        return jump;
    }
}