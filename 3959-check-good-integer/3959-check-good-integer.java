class Solution {
    public boolean checkGoodInteger(int n) {
        int sum = 0,square = 0;
        while(n>0){
            int digit = n%10;
            sum +=digit;
            square += digit*digit;
            n /=10;
        }
        if((square - sum) >=50){
        return true;
        }
            return false;
    }
}