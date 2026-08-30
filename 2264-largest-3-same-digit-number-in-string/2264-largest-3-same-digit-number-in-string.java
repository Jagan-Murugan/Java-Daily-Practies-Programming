class Solution {
    public String largestGoodInteger(String num) {
        char max = 0;
        String str= "";
        for(int i = 0; i < num.length()-2;i++){
            char ch = num.charAt(i);
           char ch2 = num.charAt(i+1);
           char ch3 = num.charAt(i+2);
           if(ch == ch2 && ch == ch3){
            str = "" +ch+ch2+ch3;
           if(ch > max){
            max = ch;
           }
           }
        }
        if(str.equals("")){
        return "";
        }
        return ""+max+max+max;
    }
}