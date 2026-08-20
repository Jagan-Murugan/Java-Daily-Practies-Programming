class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1 = Integer.MAX_VALUE,min2 = min1;
        
        for(int i = 0;i<nums1.length;i++){
          if(nums1[i]<min1){
            min1 = nums1[i];
          }  
        }
        for(int j = 0;j < nums2.length;j++){
            if(nums2[j]<min2)
            min2 = nums2[j];        
            }
            return min2-min1;
        
    }
}