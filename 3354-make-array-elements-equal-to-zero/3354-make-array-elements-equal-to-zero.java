class Solution {
    public int countValidSelections(int[] nums) {
      /* int totalsum = 0;
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
       }*/

    //    NORMAL METHOD 
    int count = 0;
        // Check every position
        for (int i = 0; i < nums.length; i++) {

            // We can start only from 0
            if(nums[i]==0){
                // Try left direction
                if(valid(nums,i,-1)){
                    count++;
                }
                // Try right direction
                if(valid(nums,i,1)){
                    count++;
                }
        }
        }
        return count;
    }
    public static boolean valid(int[] nums,int curr,int direction){
        int[] copy = nums.clone();

        while(curr >= 0 && curr < copy.length){
          // If current element is 0
            if (copy[curr] == 0) {

                // Move in the current direction
                curr = curr + direction;

            } else {

                // Decrement nums[curr] by 1
                copy[curr]--;

                // Reverse direction
                direction = -direction;

                // Take one step in the new direction
                curr = curr + direction;
            }
        }
        for(int i = 0;i<copy.length;i++){
            if(copy[i]!=0){
              return false;
            }
        }
        return true;
    }

}