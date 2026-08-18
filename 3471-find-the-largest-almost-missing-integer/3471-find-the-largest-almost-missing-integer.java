class Solution {
    public int largestInteger(int[] nums, int k) {   
        int[] count = new int[51];;
        for(int i = 0;i<=nums.length-k;i++){
            for(int j = i;j<i+k;j++){
                int x = nums[j];
                boolean found = false;
                for(int K = i;K < j;K++){
                    if(nums[K]==x){
                        found = true;
                        break;
                    }
                }
                if(!found){
                    count[x]++;
                }
            }
        }
        int ans = -1;
        for(int i = 0;i<= 50;i++){
            if(count[i] == 1){
                ans = i;
            }
        }
        return ans;
    }
}