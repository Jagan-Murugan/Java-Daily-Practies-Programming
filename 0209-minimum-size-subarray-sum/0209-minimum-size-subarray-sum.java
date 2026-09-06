class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n+1];
        for(int i = 0;i<n;i++){
            prefix[i + 1] = prefix[i] + nums[i]; 
        }
        int left = 0;
        int answer = Integer.MAX_VALUE;
        for(int right = 1;right<=n;right++){
            while(prefix[right] - prefix[left]>=target){
                answer = Math.min(answer,right - left);
                left++;
            }

        }
        return answer== Integer.MAX_VALUE ? 0 : answer;
    }
}