class Solution {
    public int countValidSelections(int[] nums) {
       int totalsum = 0;
       int n = nums.length;
       for(int num : nums){
        totalsum += num;
       }
       int count = 0;
       int leftsum = 0;
       for(int i = 0;i < n;i++){
        int rightsum = totalsum - leftsum - nums[i];
        if(nums[i] == 0){
            if(leftsum == rightsum){
                count += 2;
            }
            else if(Math.abs(leftsum - rightsum) == 1){
                count += 1;
            }
        }
        leftsum += nums[i];
       }
       return count;
    }
}