class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }

        int case1 = rob(nums,0,n-2);
        int case2 = rob(nums,1,n-1);

        return Math.max(case1,case2);
    }
    public static int rob(int[] nums,int start,int end){
        int length = end - start +1;
        int dp[] = new int[length];
        if(length == 1){
            return nums[start];
        }
        dp[0] = nums[start];

        dp[1] = Math.max(dp[0],nums[start + 1]);
        for(int i = 2;i<length;i++){
            int currenthouse = start + i;
            int skip = dp[i-1];
            int take = nums[currenthouse]+dp[i-2]; 
            dp[i] = Math.max(skip,take);
        }
        return dp[length-1];
    }
}