class Solution {
    public int[] decimalRepresentation(int n) {
        int count = 0, temp = n;
        while(temp>0){
            if(temp % 10 != 0){
                count++;
            }
            temp /= 10;
        }
        int place  = 1;
        int index = count - 1;
        int[] ans = new int[count];
        while(n > 0){
            int digit  = n % 10;
            if(digit != 0){
                ans[index] = place * digit; 
                index--;
            }
            n /= 10;
            place *= 10; 
        }
       
        return ans;
    }
}