class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i = 0;i < s.length()-1;i++){
                int s1 = s.charAt(i);
                int s2 = s.charAt(i+1);
                int sub = s1 - s2;

            if(sub < 0){
                sub = -sub;
            }
                 sum += sub;
            }
        return sum;
    }
}