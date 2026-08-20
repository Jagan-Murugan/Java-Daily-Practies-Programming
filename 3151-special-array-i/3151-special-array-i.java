class Solution {
    public boolean isArraySpecial(int[] nums) {
        /*for(int i = 1;i<nums.length;i++){
            if(nums[i] % 2 == nums[i-1] % 2){
                return false;
            }
        }
        return true;*/
       int odd = 0,even = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1] % 2 == 0 ){
                 even = 0;
            }
            else{
                 even = 1;
            }
            if(nums[i] % 2 == 0){
                odd = 0;
            }
            else{
                odd = 1;
            }
            if(odd == even){
                return false;
            }
        }
        return true;
        
    }
}