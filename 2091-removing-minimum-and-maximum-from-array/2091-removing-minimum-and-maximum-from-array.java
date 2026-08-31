class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int max = 0;
        int min = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]>nums[max]){
                max = i;
            }
            if(nums[i]<nums[min]){
                min = i;
            }
        }
        int left = Math.min(min,max);
        int right = Math.max(min,max);

        int removefront = right+1;
        int removeback = n-left;
        int removeboth = (left+1) + (n-right);
        
        return Math.min(removefront,Math.min(removeback,removeboth));
    }
}