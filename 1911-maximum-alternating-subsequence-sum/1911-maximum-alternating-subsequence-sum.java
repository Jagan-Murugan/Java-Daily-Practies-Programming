class Solution {
    public long maxAlternatingSum(int[] nums) {
        long even = 0,odd = 0;
         for(int i = 0;i<nums.length;i++){
            long Evenmax = Math.max(even,odd+nums[i]);
            long Oddmax = Math.max(odd,even-nums[i]);
            even = Evenmax;
            odd = Oddmax;
         }
        return even;
    }
}