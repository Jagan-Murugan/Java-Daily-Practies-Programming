class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int ans = 0;
        for(int i = 1;i<s.length();i++){
         ans = Math.abs(s.charAt(i-1) - s.charAt(i));
         if(ans>2){
            return false;
         }   
        }
        return true;
    }
}