class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int[] nums2 = new int[n];
        for(int i = 0;i<n;i++){
            nums2[i] = nums1[i];
            for(int j = 0;j<n;j++){
                if(i != j){
                    if(nums1[i] % 2 == 0 && nums1[j]% 2!= 0){
                nums2[i] = nums1[i] - nums1[j];
                break;
                    }
                    if(nums1[i] % 2 != 0){
                        nums2[i] = nums1[i];
                        break;
                    }
                }
            }
        }
        boolean odd = nums2[0] % 2 != 0;
        boolean even = nums2[0] % 2 == 0;

        for(int i = 1;i<n;i++){
            if(odd && nums2[i] %2 == 0){
                return false;
            }
            if(even && nums2[i] % 2 != 0){
                return false;
            }
        }
        return true;
        
    }
}