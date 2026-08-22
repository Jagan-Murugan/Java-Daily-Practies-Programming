class Solution {
    public int[] transformArray(int[] nums) {
       /* int[] res = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                res[i] = 0;
            }
            else{
                res[i] = 1;
            }
        }
        Arrays.sort(res);
        return res;*/
        int even = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                even++;
            }
        }
        int[] ans = new int[nums.length];
        for(int i = even;i<nums.length;i++){
            ans[i] = 1;
        } 
        return ans;
    }
}