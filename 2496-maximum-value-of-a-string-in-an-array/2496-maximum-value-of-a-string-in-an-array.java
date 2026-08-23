class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for(int i = 0;i<strs.length;i++){
            String num = strs[i];
            boolean letter = false;
            int value = 0;
            for(int j = 0;j<num.length();j++){
                char ch = num.charAt(j);
                if(ch>='a' && ch<='z'){
                    letter = true;
                    break;
                }
                else{
                    value = value * 10 + (ch - '0'); 
                }
            }
            if(letter){
                value = num.length();
            }
            if(value > max){
                max = value;
            }
        }
        return max;
    }
}