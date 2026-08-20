class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int index = 0,index2 = 0;
         arr1[index++] = nums[0];
        arr2[index2++] = nums[1];
        for(int i = 2;i < nums.length;i++){
            if(arr1[index-1]>arr2[index2-1]){
                arr1[index++] = nums[i];
            }
            else{
                arr2[index2++] = nums[i];
            }
        }
        int[] result = new int[n];
        int k = 0;
        for(int i = 0;i<index;i++){
            result[k] = arr1[i];
            k++;
        }
        for(int i = 0;i < index2;i++){
            result[k] = arr2[i];
            k++;
        }
        return result;
        
    }
}