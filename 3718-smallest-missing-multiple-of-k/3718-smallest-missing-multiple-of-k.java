class Solution {
    public int missingMultiple(int[] nums, int k) {
        /*if(nums.length<=1){
            if(nums[0]==k)
                return k+k;
            return k;    
        }
        
          
        boolean flag = false;    
        for(int i = 0;i <nums.length;i++){
            int r = nums[i];
            if(r%k == 0){
                flag = true;
            }
        }
        if(!flag){
            return k;
        }
        else{
            int max = Integer.MIN_VALUE;
            int ans = k;
            for(int i = 0;i <nums.length;i++){
                int r = nums[i];
                if(r%k == 0){
                    if(r > max){
                        max =r;
                    }
                }
            }
            ArrayList<Integer> list = new ArrayList<>();
            for(int n : nums){
                list.add(n);
            }
            for(int i=k;i<=max;i=i+k){
                if(!list.contains(i)){
                    return i;
                }
            }
            return max+k;
        } */
       for(int i = 1; ; i++){
        int multiple = i * k;
        boolean found = false;
        for(int j = 0;j<nums.length;j++){
            if(nums[j] == multiple){
                found = true;
            }
        }
            if(!found){
                return multiple;
            }   
}
 }
}
