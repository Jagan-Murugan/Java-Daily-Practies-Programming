class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n+1];
        for(int num : nums){

            freq[num]++;
        }
        int []ans = new int[2];
        int index = 0;
        for(int i = 0;i<n+1;i++){
           if(freq[i] == 2){
            ans[index++] = i;
           
           } 
        }
        return ans;
    }
}